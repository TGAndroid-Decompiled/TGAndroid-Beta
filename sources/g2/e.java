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
import androidx.lifecycle.j;
import f7.q8;
import g7.o7;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.i;
import m.q;
public final class e {
    public boolean f7069a;
    public boolean f7070b;
    public boolean f7071c;
    public final Object d;
    public Parcelable f7072e;
    public Object f7073f;

    public e(TextView textView) {
        this.f7072e = null;
        this.f7073f = null;
        this.f7069a = false;
        this.f7070b = false;
        this.d = textView;
    }

    public void a() {
        Drawable drawable;
        CompoundButton compoundButton = (CompoundButton) this.d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable = e0.b.d(compoundButton);
        } else {
            if (!o7.f7330b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    o7.f7329a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
                }
                o7.f7330b = true;
            }
            Field field = o7.f7329a;
            if (field != null) {
                try {
                    drawable = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e11) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                    o7.f7329a = null;
                }
            }
            drawable = null;
        }
        if (drawable != null) {
            if (this.f7069a || this.f7070b) {
                Drawable mutate = q8.d(drawable).mutate();
                if (this.f7069a) {
                    mutate.setTintList((ColorStateList) this.f7072e);
                }
                if (this.f7070b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f7073f);
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
            if (this.f7069a || this.f7070b) {
                Drawable mutate = q8.d(checkMarkDrawable).mutate();
                if (this.f7069a) {
                    mutate.setTintList((ColorStateList) this.f7072e);
                }
                if (this.f7070b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f7073f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.f7070b) {
            Bundle bundle = (Bundle) this.f7072e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f7072e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f7072e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f7072e = null;
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
                i.d(components, "components");
                dVar = (d) components.getValue();
            } else {
                return null;
            }
        } while (!i.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(android.util.AttributeSet r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: g2.e.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, d provider) {
        Object obj;
        i.e(provider, "provider");
        o.f fVar = (o.f) this.d;
        o.c i9 = fVar.i(str);
        if (i9 != null) {
            obj = i9.f18737b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f18743b;
            if (cVar2 == null) {
                fVar.f18742a = cVar;
                fVar.f18743b = cVar;
            } else {
                cVar2.f18738c = cVar;
                cVar.d = cVar2;
                fVar.f18743b = cVar;
            }
            obj = null;
        }
        if (((d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f7071c) {
            a aVar = (a) this.f7073f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f7073f = aVar;
            try {
                j.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f7073f;
                if (aVar2 != null) {
                    aVar2.f7067a.add(j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public e() {
        this.d = new o.f();
        this.f7071c = true;
    }
}
