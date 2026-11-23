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
    public Parcelable f20195a;
    public Object f20196b;
    public boolean f20197c;
    public boolean d;
    public boolean f20198e;
    public final Object f20199f;

    public p(TextView textView) {
        this.f20195a = null;
        this.f20196b = null;
        this.f20197c = false;
        this.d = false;
        this.f20199f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f20199f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f20197c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f20197c) {
                    mutate.setTintList((ColorStateList) this.f20195a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f20196b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        o oVar = (o) this.f20199f;
        Drawable checkMarkDrawable = oVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f20197c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f20197c) {
                    mutate.setTintList((ColorStateList) this.f20195a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.f20196b);
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
            Bundle bundle = (Bundle) this.f20195a;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f20195a;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f20195a;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f20195a = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public w4.d d() {
        Map.Entry components;
        w4.d dVar;
        Iterator it = ((o.f) this.f20199f).iterator();
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
        o.f fVar = (o.f) this.f20199f;
        o.c f10 = fVar.f(str);
        if (f10 != null) {
            obj = f10.f21578b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f21584b;
            if (cVar2 == null) {
                fVar.f21583a = cVar;
                fVar.f21584b = cVar;
            } else {
                cVar2.f21579c = cVar;
                cVar.d = cVar2;
                fVar.f21584b = cVar;
            }
            obj = null;
        }
        if (((w4.d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void g() {
        if (this.f20198e) {
            w4.a aVar = (w4.a) this.f20196b;
            if (aVar == null) {
                aVar = new w4.a(this);
            }
            this.f20196b = aVar;
            try {
                androidx.lifecycle.j.class.getDeclaredConstructor(null);
                w4.a aVar2 = (w4.a) this.f20196b;
                if (aVar2 != null) {
                    aVar2.f59638a.add(androidx.lifecycle.j.class.getName());
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
        this.f20199f = new o.f();
        this.f20198e = true;
    }
}
