package g2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import j7.i8;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import k7.u7;
import kotlin.jvm.internal.j;
import m.p;
public final class e {
    public boolean f6823a;
    public boolean f6824b;
    public boolean f6825c;
    public final Object d;
    public Parcelable f6826e;
    public Object f6827f;

    public e(TextView textView) {
        this.f6826e = null;
        this.f6827f = null;
        this.f6823a = false;
        this.f6824b = false;
        this.d = textView;
    }

    public void a() {
        Drawable drawable;
        CompoundButton compoundButton = (CompoundButton) this.d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = e0.b.d(compoundButton);
        } else {
            if (!u7.f10738b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    u7.f10737a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e6) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e6);
                }
                u7.f10738b = true;
            }
            Field field = u7.f10737a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e10) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                    u7.f10737a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.f6823a || this.f6824b) {
                Drawable mutate = i8.d(drawable).mutate();
                if (this.f6823a) {
                    mutate.setTintList((ColorStateList) this.f6826e);
                }
                if (this.f6824b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f6827f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        p pVar = (p) this.d;
        Drawable checkMarkDrawable = pVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f6823a || this.f6824b) {
                Drawable mutate = i8.d(checkMarkDrawable).mutate();
                if (this.f6823a) {
                    mutate.setTintList((ColorStateList) this.f6826e);
                }
                if (this.f6824b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f6827f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(pVar.getDrawableState());
                }
                pVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.f6824b) {
            Bundle bundle = (Bundle) this.f6826e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f6826e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f6826e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f6826e = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public d d() {
        Map.Entry components;
        d dVar;
        Iterator it = ((o.f) this.d).iterator();
        do {
            o.b bVar = (o.b) it;
            if (bVar.hasNext()) {
                components = (Map.Entry) bVar.next();
                j.d(components, "components");
                dVar = (d) components.getValue();
            } else {
                return null;
            }
        } while (!j.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(android.util.AttributeSet r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: g2.e.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, d provider) {
        Object obj;
        j.e(provider, "provider");
        o.f fVar = (o.f) this.d;
        o.c i10 = fVar.i(str);
        if (i10 != null) {
            obj = i10.f16273b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f16279b;
            if (cVar2 == null) {
                fVar.f16278a = cVar;
                fVar.f16279b = cVar;
            } else {
                cVar2.f16274c = cVar;
                cVar.d = cVar2;
                fVar.f16279b = cVar;
            }
            obj = null;
        }
        if (((d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f6825c) {
            a aVar = (a) this.f6827f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f6827f = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f6827f;
                if (aVar2 != null) {
                    aVar2.f6821a.add(androidx.lifecycle.j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e6) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public e() {
        this.d = new o.f();
        this.f6825c = true;
    }
}
