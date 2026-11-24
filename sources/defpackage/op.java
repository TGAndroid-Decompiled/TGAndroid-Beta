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
public final class op {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public op(TextView textView) {
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
        np npVar = (np) this.f;
        Drawable checkMarkDrawable = npVar.getCheckMarkDrawable();
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
                    mutate.setState(npVar.getDrawableState());
                }
                npVar.setCheckMarkDrawable(mutate);
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
        dq9.m("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        return null;
    }

    public final ds9 d() {
        Map.Entry entry;
        ds9 ds9Var;
        Iterator it = ((xq9) this.f).iterator();
        do {
            tq9 tq9Var = (tq9) it;
            if (tq9Var.hasNext()) {
                entry = (Map.Entry) tq9Var.next();
                entry.getClass();
                ds9Var = (ds9) entry.getValue();
            } else {
                return null;
            }
        } while (!rr5.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ds9Var;
    }

    public final void e(android.util.AttributeSet r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op.e(android.util.AttributeSet, int):void");
    }

    public final void f(String str, ds9 ds9Var) {
        Object obj;
        ds9Var.getClass();
        xq9 xq9Var = (xq9) this.f;
        uq9 h = xq9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            uq9 uq9Var = new uq9(str, ds9Var);
            xq9Var.d++;
            uq9 uq9Var2 = xq9Var.b;
            if (uq9Var2 == null) {
                xq9Var.a = uq9Var;
                xq9Var.b = uq9Var;
            } else {
                uq9Var2.c = uq9Var;
                uq9Var.d = uq9Var2;
                xq9Var.b = uq9Var;
            }
            obj = null;
        }
        if (((ds9) obj) == null) {
            return;
        }
        u36.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (this.e) {
            m49 m49Var = (m49) this.b;
            if (m49Var == null) {
                m49Var = new m49(this);
            }
            this.b = m49Var;
            try {
                k26.class.getDeclaredConstructor(null);
                m49 m49Var2 = (m49) this.b;
                if (m49Var2 != null) {
                    m49Var2.a.add(k26.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = k26.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        dq9.m("Can not perform this action after onSaveInstanceState");
    }

    public op() {
        this.f = new xq9();
        this.e = true;
    }
}
