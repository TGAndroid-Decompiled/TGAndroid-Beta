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
    public Parcelable f15791a;
    public Object f15792b;
    public boolean f15793c;
    public boolean d;
    public boolean f15794e;
    public final Object f15795f;

    public p(TextView textView) {
        this.f15791a = null;
        this.f15792b = null;
        this.f15793c = false;
        this.d = false;
        this.f15795f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f15795f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f15793c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f15793c) {
                    mutate.setTintList((ColorStateList) this.f15791a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f15792b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        o oVar = (o) this.f15795f;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f15793c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f15793c) {
                    mutate.setTintList((ColorStateList) this.f15791a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f15792b);
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
            Bundle bundle = (Bundle) this.f15791a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f15791a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f15791a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f15791a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public t4.d d() {
        Map.Entry components;
        t4.d dVar;
        Iterator it = ((o.f) this.f15795f).iterator();
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
        o.f fVar = (o.f) this.f15795f;
        o.c i10 = fVar.i(str);
        if (i10 != null) {
            obj = i10.f16926b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f16932b;
            if (cVar2 == null) {
                fVar.f16931a = cVar;
                fVar.f16932b = cVar;
            } else {
                cVar2.f16927c = cVar;
                cVar.d = cVar2;
                fVar.f16932b = cVar;
            }
            obj = null;
        }
        if (((t4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f15794e) {
            t4.a aVar = (t4.a) this.f15792b;
            if (aVar == null) {
                aVar = new t4.a(this);
            }
            this.f15792b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                t4.a aVar2 = (t4.a) this.f15792b;
                if (aVar2 != null) {
                    aVar2.f48287a.add(androidx.lifecycle.j.class.getName());
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
        this.f15795f = new o.f();
        this.f15794e = true;
    }
}
