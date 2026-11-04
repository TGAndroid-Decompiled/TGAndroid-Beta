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
    public Parcelable f18688a;
    public Object f18689b;
    public boolean f18690c;
    public boolean d;
    public boolean f18691e;
    public final Object f18692f;

    public p(TextView textView) {
        this.f18688a = null;
        this.f18689b = null;
        this.f18690c = false;
        this.d = false;
        this.f18692f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f18692f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f18690c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f18690c) {
                    mutate.setTintList((ColorStateList) this.f18688a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f18689b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        o oVar = (o) this.f18692f;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f18690c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f18690c) {
                    mutate.setTintList((ColorStateList) this.f18688a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f18689b);
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
            Bundle bundle = (Bundle) this.f18688a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f18688a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f18688a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f18688a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public v4.d d() {
        Map.Entry components;
        v4.d dVar;
        Iterator it = ((o.f) this.f18692f).iterator();
        do {
            o.b bVar = (o.b) it;
            if (bVar.hasNext()) {
                components = (Map.Entry) bVar.next();
                kotlin.jvm.internal.j.d(components, "components");
                dVar = (v4.d) components.getValue();
            } else {
                return null;
            }
        } while (!kotlin.jvm.internal.j.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(android.util.AttributeSet r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: m.p.e(android.util.AttributeSet, int):void");
    }

    public void f(String str, v4.d provider) {
        Object obj;
        kotlin.jvm.internal.j.e(provider, "provider");
        o.f fVar = (o.f) this.f18692f;
        o.c h = fVar.h(str);
        if (h != null) {
            obj = h.f20467b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f20473b;
            if (cVar2 == null) {
                fVar.f20472a = cVar;
                fVar.f20473b = cVar;
            } else {
                cVar2.f20468c = cVar;
                cVar.d = cVar2;
                fVar.f20473b = cVar;
            }
            obj = null;
        }
        if (((v4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f18691e) {
            v4.a aVar = (v4.a) this.f18689b;
            if (aVar == null) {
                aVar = new v4.a(this);
            }
            this.f18689b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                v4.a aVar2 = (v4.a) this.f18689b;
                if (aVar2 != null) {
                    aVar2.f56442a.add(androidx.lifecycle.j.class.getName());
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
        this.f18692f = new o.f();
        this.f18691e = true;
    }
}
