package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import v7.r8;
import w7.p7;
public final class p {
    public Parcelable f15845a;
    public Object f15846b;
    public boolean f15847c;
    public boolean d;
    public boolean f15848e;
    public final Object f15849f;

    public p(TextView textView) {
        this.f15845a = null;
        this.f15846b = null;
        this.f15847c = false;
        this.d = false;
        this.f15849f = textView;
    }

    public void a() {
        Drawable drawable;
        CompoundButton compoundButton = (CompoundButton) this.f15849f;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = e0.b.e(compoundButton);
        } else {
            if (!p7.f48820b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    p7.f48819a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e7) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e7);
                }
                p7.f48820b = true;
            }
            Field field = p7.f48819a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e10) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                    p7.f48819a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.f15847c || this.d) {
                Drawable mutate = r8.d(drawable).mutate();
                if (this.f15847c) {
                    mutate.setTintList((ColorStateList) this.f15845a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f15846b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        o oVar = (o) this.f15849f;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f15847c || this.d) {
                Drawable mutate = r8.d(checkMarkDrawable).mutate();
                if (this.f15847c) {
                    mutate.setTintList((ColorStateList) this.f15845a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f15846b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(oVar.getDrawableState());
                }
                oVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.f15845a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f15845a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f15845a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f15845a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public t4.d d() {
        Map.Entry components;
        t4.d dVar;
        Iterator it = ((o.f) this.f15849f).iterator();
        do {
            o.b bVar = (o.b) it;
            if (bVar.hasNext()) {
                components = (Map.Entry) bVar.next();
                kotlin.jvm.internal.i.d(components, "components");
                dVar = (t4.d) components.getValue();
            } else {
                return null;
            }
        } while (!kotlin.jvm.internal.i.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(android.util.AttributeSet r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: m.p.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, t4.d provider) {
        Object obj;
        kotlin.jvm.internal.i.e(provider, "provider");
        o.f fVar = (o.f) this.f15849f;
        o.c i10 = fVar.i(str);
        if (i10 != null) {
            obj = i10.f16928b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f16934b;
            if (cVar2 == null) {
                fVar.f16933a = cVar;
                fVar.f16934b = cVar;
            } else {
                cVar2.f16929c = cVar;
                cVar.d = cVar2;
                fVar.f16934b = cVar;
            }
            obj = null;
        }
        if (((t4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f15848e) {
            t4.a aVar = (t4.a) this.f15846b;
            if (aVar == null) {
                aVar = new t4.a(this);
            }
            this.f15846b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                t4.a aVar2 = (t4.a) this.f15846b;
                if (aVar2 != null) {
                    aVar2.f46901a.add(androidx.lifecycle.j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e7) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public p() {
        this.f15849f = new o.f();
        this.f15848e = true;
    }
}
