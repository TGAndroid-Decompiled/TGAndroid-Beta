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
import h7.l8;
import i7.a8;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.j;
import m.q;
public final class e {
    public boolean f6979a;
    public boolean f6980b;
    public boolean f6981c;
    public final Object d;
    public Parcelable f6982e;
    public Object f6983f;

    public e(TextView textView) {
        this.f6982e = null;
        this.f6983f = null;
        this.f6979a = false;
        this.f6980b = false;
        this.d = textView;
    }

    public void a() {
        Drawable drawable;
        CompoundButton compoundButton = (CompoundButton) this.d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = e0.b.d(compoundButton);
        } else {
            if (!a8.f8264b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    a8.f8263a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
                }
                a8.f8264b = true;
            }
            Field field = a8.f8263a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e11) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                    a8.f8263a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.f6979a || this.f6980b) {
                Drawable mutate = l8.d(drawable).mutate();
                if (this.f6979a) {
                    mutate.setTintList((ColorStateList) this.f6982e);
                }
                if (this.f6980b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f6983f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.d;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f6979a || this.f6980b) {
                Drawable mutate = l8.d(checkMarkDrawable).mutate();
                if (this.f6979a) {
                    mutate.setTintList((ColorStateList) this.f6982e);
                }
                if (this.f6980b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f6983f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.f6980b) {
            Bundle bundle = (Bundle) this.f6982e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f6982e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f6982e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f6982e = null;
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
            obj = i10.f18978b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f18984b;
            if (cVar2 == null) {
                fVar.f18983a = cVar;
                fVar.f18984b = cVar;
            } else {
                cVar2.f18979c = cVar;
                cVar.d = cVar2;
                fVar.f18984b = cVar;
            }
            obj = null;
        }
        if (((d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f6981c) {
            a aVar = (a) this.f6983f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f6983f = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f6983f;
                if (aVar2 != null) {
                    aVar2.f6977a.add(androidx.lifecycle.j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public e() {
        this.d = new o.f();
        this.f6981c = true;
    }
}
