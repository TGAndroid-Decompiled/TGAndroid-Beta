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
public final class q {
    public Parcelable f16297a;
    public Object f16298b;
    public boolean f16299c;
    public boolean d;
    public boolean e;
    public final Object f16300f;

    public q(TextView textView) {
        this.f16297a = null;
        this.f16298b = null;
        this.f16299c = false;
        this.d = false;
        this.f16300f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f16300f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f16299c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f16299c) {
                    mutate.setTintList((ColorStateList) this.f16297a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f16298b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        p pVar = (p) this.f16300f;
        Drawable checkMarkDrawable = pVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f16299c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f16299c) {
                    mutate.setTintList((ColorStateList) this.f16297a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f16298b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(pVar.getDrawableState());
                }
                pVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.d) {
            Bundle bundle = (Bundle) this.f16297a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f16297a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f16297a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f16297a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public t4.d d() {
        Map.Entry components;
        t4.d dVar;
        Iterator it = ((o.f) this.f16300f).iterator();
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
        throw new UnsupportedOperationException("Method not decompiled: m.q.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, t4.d provider) {
        Object obj;
        kotlin.jvm.internal.i.e(provider, "provider");
        o.f fVar = (o.f) this.f16300f;
        o.c h = fVar.h(str);
        if (h != null) {
            obj = h.f17504b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f17510b;
            if (cVar2 == null) {
                fVar.f17509a = cVar;
                fVar.f17510b = cVar;
            } else {
                cVar2.f17505c = cVar;
                cVar.d = cVar2;
                fVar.f17510b = cVar;
            }
            obj = null;
        }
        if (((t4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.e) {
            t4.a aVar = (t4.a) this.f16298b;
            if (aVar == null) {
                aVar = new t4.a(this);
            }
            this.f16298b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                t4.a aVar2 = (t4.a) this.f16298b;
                if (aVar2 != null) {
                    aVar2.f46869a.add(androidx.lifecycle.j.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public q() {
        this.f16300f = new o.f();
        this.e = true;
    }
}
