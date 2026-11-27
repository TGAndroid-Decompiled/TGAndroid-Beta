package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;
public final class po {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public po(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }

    public final void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public final void b() {
        oo ooVar = (oo) this.f;
        Drawable checkMarkDrawable = ooVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(ooVar.getDrawableState());
                }
                ooVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public final Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.a = null;
            return bundle2;
        }
        grb.i("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        return null;
    }

    public final ut9 d() {
        Map.Entry entry;
        ut9 ut9Var;
        Iterator it = ((os9) this.f).iterator();
        do {
            ks9 ks9Var = (ks9) it;
            if (ks9Var.hasNext()) {
                entry = (Map.Entry) ks9Var.next();
                entry.getClass();
                ut9Var = (ut9) entry.getValue();
            } else {
                return null;
            }
        } while (!ur5.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ut9Var;
    }

    public final void e(android.util.AttributeSet r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po.e(android.util.AttributeSet, int):void");
    }

    public final void f(String str, ut9 ut9Var) {
        Object obj;
        ut9Var.getClass();
        os9 os9Var = (os9) this.f;
        ls9 h = os9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            ls9 ls9Var = new ls9(str, ut9Var);
            os9Var.d++;
            ls9 ls9Var2 = os9Var.b;
            if (ls9Var2 == null) {
                os9Var.a = ls9Var;
                os9Var.b = ls9Var;
            } else {
                ls9Var2.c = ls9Var;
                ls9Var.d = ls9Var2;
                os9Var.b = ls9Var;
            }
            obj = null;
        }
        if (((ut9) obj) == null) {
            return;
        }
        lq5.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (this.e) {
            y59 y59Var = (y59) this.b;
            if (y59Var == null) {
                y59Var = new y59(this);
            }
            this.b = y59Var;
            try {
                o26.class.getDeclaredConstructor(null);
                y59 y59Var2 = (y59) this.b;
                if (y59Var2 != null) {
                    y59Var2.a.add(o26.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = o26.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        grb.i("Can not perform this action after onSaveInstanceState");
    }

    public po() {
        this.f = new os9();
        this.e = true;
    }
}
