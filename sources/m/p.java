package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;
public final class p {
    public Parcelable f20161a;
    public Object f20162b;
    public boolean f20163c;
    public boolean d;
    public boolean f20164e;
    public final Object f20165f;

    public p(TextView textView) {
        this.f20161a = null;
        this.f20162b = null;
        this.f20163c = false;
        this.d = false;
        this.f20165f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f20165f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f20163c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f20163c) {
                    mutate.setTintList((ColorStateList) this.f20161a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f20162b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        o oVar = (o) this.f20165f;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f20163c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f20163c) {
                    mutate.setTintList((ColorStateList) this.f20161a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f20162b);
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
            Bundle bundle = (Bundle) this.f20161a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f20161a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f20161a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f20161a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public w4.d d() {
        Map.Entry components;
        w4.d dVar;
        Iterator it = ((o.f) this.f20165f).iterator();
        do {
            o.b bVar = (o.b) it;
            if (bVar.hasNext()) {
                components = (Map.Entry) bVar.next();
                kotlin.jvm.internal.j.d(components, "components");
                dVar = (w4.d) components.getValue();
            } else {
                return null;
            }
        } while (!kotlin.jvm.internal.j.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(android.util.AttributeSet r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: m.p.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, w4.d provider) {
        Object obj;
        kotlin.jvm.internal.j.e(provider, "provider");
        o.f fVar = (o.f) this.f20165f;
        o.c f10 = fVar.f(str);
        if (f10 != null) {
            obj = f10.f21544b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f21550b;
            if (cVar2 == null) {
                fVar.f21549a = cVar;
                fVar.f21550b = cVar;
            } else {
                cVar2.f21545c = cVar;
                cVar.d = cVar2;
                fVar.f21550b = cVar;
            }
            obj = null;
        }
        if (((w4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f20164e) {
            w4.a aVar = (w4.a) this.f20162b;
            if (aVar == null) {
                aVar = new w4.a(this);
            }
            this.f20162b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                w4.a aVar2 = (w4.a) this.f20162b;
                if (aVar2 != null) {
                    aVar2.f59603a.add(androidx.lifecycle.j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public p() {
        this.f20165f = new o.f();
        this.f20164e = true;
    }
}
