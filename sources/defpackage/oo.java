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
public final class oo {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public oo(TextView textView) {
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
        no noVar = (no) this.f;
        Drawable checkMarkDrawable = noVar.getCheckMarkDrawable();
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
                    mutate.setState(noVar.getDrawableState());
                }
                noVar.setCheckMarkDrawable(mutate);
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
        sc8.j("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        return null;
    }

    public final cq9 d() {
        Map.Entry entry;
        cq9 cq9Var;
        Iterator it = ((wo9) this.f).iterator();
        do {
            so9 so9Var = (so9) it;
            if (so9Var.hasNext()) {
                entry = (Map.Entry) so9Var.next();
                entry.getClass();
                cq9Var = (cq9) entry.getValue();
            } else {
                return null;
            }
        } while (!rp5.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return cq9Var;
    }

    public final void e(android.util.AttributeSet r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo.e(android.util.AttributeSet, int):void");
    }

    public final void f(String str, cq9 cq9Var) {
        Object obj;
        cq9Var.getClass();
        wo9 wo9Var = (wo9) this.f;
        to9 h = wo9Var.h(str);
        if (h != null) {
            obj = h.b;
        } else {
            to9 to9Var = new to9(str, cq9Var);
            wo9Var.d++;
            to9 to9Var2 = wo9Var.b;
            if (to9Var2 == null) {
                wo9Var.a = to9Var;
                wo9Var.b = to9Var;
            } else {
                to9Var2.c = to9Var;
                to9Var.d = to9Var2;
                wo9Var.b = to9Var;
            }
            obj = null;
        }
        if (((cq9) obj) == null) {
            return;
        }
        w26.j("SavedStateProvider with the given key is already registered");
    }

    public final void g() {
        if (this.e) {
            j29 j29Var = (j29) this.b;
            if (j29Var == null) {
                j29Var = new j29(this);
            }
            this.b = j29Var;
            try {
                k06.class.getDeclaredConstructor(null);
                j29 j29Var2 = (j29) this.b;
                if (j29Var2 != null) {
                    j29Var2.a.add(k06.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = k06.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        sc8.j("Can not perform this action after onSaveInstanceState");
    }

    public oo() {
        this.f = new wo9();
        this.e = true;
    }
}
