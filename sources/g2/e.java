package g2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.TextView;
import g7.k8;
import g7.o7;
import h7.m7;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.j;
import m.m1;
import m.q;
import r0.j0;

public final class e {

    public boolean f6347a;

    public boolean f6348b;

    public boolean f6349c;
    public final Object d;

    public Parcelable f6350e;

    public Object f6351f;

    public e(TextView textView) {
        this.f6350e = null;
        this.f6351f = null;
        this.f6347a = false;
        this.f6348b = false;
        this.d = textView;
    }

    public void a() {
        Drawable drawableD;
        CompoundButton compoundButton = (CompoundButton) this.d;
        if (Build.VERSION.SDK_INT >= 23) {
            drawableD = e0.b.d(compoundButton);
        } else {
            if (!m7.f8485b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    m7.f8484a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e9) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e9);
                }
                m7.f8485b = true;
            }
            Field field = m7.f8484a;
            if (field != null) {
                try {
                    drawableD = (Drawable) field.get(compoundButton);
                } catch (IllegalAccessException e10) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e10);
                    m7.f8484a = null;
                    drawableD = null;
                }
            } else {
                drawableD = null;
            }
        }
        if (drawableD != null) {
            if (this.f6347a || this.f6348b) {
                Drawable drawableMutate = k8.d(drawableD).mutate();
                if (this.f6347a) {
                    drawableMutate.setTintList((ColorStateList) this.f6350e);
                }
                if (this.f6348b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f6351f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        q qVar = (q) this.d;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f6347a || this.f6348b) {
                Drawable drawableMutate = k8.d(checkMarkDrawable).mutate();
                if (this.f6347a) {
                    drawableMutate.setTintList((ColorStateList) this.f6350e);
                }
                if (this.f6348b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f6351f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Bundle c(String str) {
        if (!this.f6348b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f6350e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f6350e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f6350e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f6350e = null;
        return bundle2;
    }

    public d d() {
        String str;
        d dVar;
        Iterator it = ((o.f) this.d).iterator();
        do {
            o.b bVar = (o.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            j.d(components, "components");
            str = (String) components.getKey();
            dVar = (d) components.getValue();
        } while (!j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void e(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.d;
        Context context = compoundButton.getContext();
        int[] iArr = f.a.f5584m;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        j0.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(o7.b(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(o7.b(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(o7.b(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(aVarG.x(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(m1.b(typedArray.getInt(3, -1), null));
            }
        } finally {
            aVarG.I();
        }
    }

    public void f(String str, d provider) {
        Object obj;
        j.e(provider, "provider");
        o.f fVar = (o.f) this.d;
        o.c cVarI = fVar.i(str);
        if (cVarI != null) {
            obj = cVarI.f19079b;
        } else {
            o.c cVar = new o.c(str, provider);
            fVar.d++;
            o.c cVar2 = fVar.f19085b;
            if (cVar2 == null) {
                fVar.f19084a = cVar;
                fVar.f19085b = cVar;
            } else {
                cVar2.f19080c = cVar;
                cVar.d = cVar2;
                fVar.f19085b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void g() {
        if (!this.f6349c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f6351f;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f6351f = aVar;
        try {
            androidx.lifecycle.j.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f6351f;
            if (aVar2 != null) {
                aVar2.f6345a.add(androidx.lifecycle.j.class.getName());
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + androidx.lifecycle.j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }

    public e() {
        this.d = new o.f();
        this.f6349c = true;
    }
}
