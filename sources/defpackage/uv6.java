package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class uv6 extends j79 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public sv6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final wv6 x;

    public uv6(wv6 wv6Var) {
        this.x = wv6Var;
        Context context = wv6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = nte.d(context, 2130968868);
        this.f = nte.d(context, 2130968877);
        this.h = nte.d(context, 2130968874);
        this.n = nte.d(context, 2130968873);
        this.s = context.getResources().getInteger(2131361803);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override
    public final void A(f89 f89Var) {
        this.x.M.values().remove(f89Var);
    }

    public final void D(int i, View view) {
        uu6 uu6Var = new uu6(i, view.getLayoutParams().height, view, (byte) 1);
        uu6Var.setAnimationListener(new md(this, (byte) 2));
        uu6Var.setDuration(this.s);
        uu6Var.setInterpolator(this.w);
        view.startAnimation(uu6Var);
    }

    public final Drawable E(jw6 jw6Var) {
        Uri uri = jw6Var.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x.E.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = jw6Var.n;
        if (i != 1) {
            if (i != 2) {
                if (jw6Var.e()) {
                    return this.n;
                }
                return this.e;
            }
            return this.h;
        }
        return this.f;
    }

    public final void F() {
        yv6 yv6Var;
        wv6 wv6Var = this.x;
        ArrayList arrayList = wv6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = wv6Var.w;
        ArrayList arrayList3 = new ArrayList();
        iw6 iw6Var = wv6Var.r.a;
        lw6.b();
        for (jw6 jw6Var : DesugarCollections.unmodifiableList(iw6Var.b)) {
            v34 b = wv6Var.r.b(jw6Var);
            if (b != null && (yv6Var = (yv6) b.b) != null && yv6Var.d) {
                arrayList3.add(jw6Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        f();
    }

    public final void G() {
        String str;
        String str2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        wv6 wv6Var = this.x;
        ArrayList arrayList2 = wv6Var.x;
        Context context = wv6Var.E;
        ArrayList arrayList3 = wv6Var.w;
        this.r = new sv6(wv6Var.r, 1);
        ArrayList arrayList4 = wv6Var.s;
        boolean z = false;
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new sv6((jw6) obj, 3));
            }
        } else {
            arrayList.add(new sv6(wv6Var.r, 3));
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jw6 jw6Var = (jw6) obj2;
                if (!arrayList4.contains(jw6Var)) {
                    if (!z2) {
                        wv6Var.r.getClass();
                        zv6 a = jw6.a();
                        if (a != null) {
                            str2 = a.j();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = context.getString(2131689664);
                        }
                        arrayList.add(new sv6(str2, 2));
                        z2 = true;
                    }
                    arrayList.add(new sv6(jw6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                jw6 jw6Var2 = (jw6) obj3;
                jw6 jw6Var3 = wv6Var.r;
                if (jw6Var3 != jw6Var2) {
                    if (!z) {
                        jw6Var3.getClass();
                        zv6 a2 = jw6.a();
                        if (a2 != null) {
                            str = a2.k();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = context.getString(2131689665);
                        }
                        arrayList.add(new sv6(str, 2));
                        z = true;
                    }
                    arrayList.add(new sv6(jw6Var2, 4));
                }
            }
        }
        F();
    }

    @Override
    public final int b() {
        return this.c.size() + 1;
    }

    @Override
    public final int d(int i) {
        sv6 sv6Var;
        if (i == 0) {
            sv6Var = this.r;
        } else {
            sv6Var = (sv6) this.c.get(i - 1);
        }
        return sv6Var.b;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        sv6 sv6Var;
        sv6 sv6Var2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        v34 b;
        yv6 yv6Var;
        float f3;
        ArrayList arrayList = this.c;
        if (i == 0) {
            sv6Var = this.r;
        } else {
            sv6Var = (sv6) arrayList.get(i - 1);
        }
        byte b2 = sv6Var.b;
        boolean z3 = true;
        if (i == 0) {
            sv6Var2 = this.r;
        } else {
            sv6Var2 = (sv6) arrayList.get(i - 1);
        }
        wv6 wv6Var = this.x;
        int i2 = 0;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        pv6 pv6Var = (pv6) f89Var;
                        View view = pv6Var.v;
                        jw6 jw6Var = (jw6) sv6Var2.a;
                        pv6Var.A = jw6Var;
                        ImageView imageView = pv6Var.w;
                        imageView.setVisibility(0);
                        pv6Var.x.setVisibility(4);
                        uv6 uv6Var = pv6Var.B;
                        List unmodifiableList = DesugarCollections.unmodifiableList(uv6Var.x.r.v);
                        if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == jw6Var) {
                            f3 = pv6Var.z;
                        } else {
                            f3 = 1.0f;
                        }
                        view.setAlpha(f3);
                        view.setOnClickListener(new h6(pv6Var, (byte) 11));
                        imageView.setImageDrawable(uv6Var.E(jw6Var));
                        pv6Var.y.setText(jw6Var.d);
                        return;
                    }
                    grb.g();
                    return;
                }
                wv6Var.M.put(((jw6) sv6Var2.a).c, (ov6) f89Var);
                tv6 tv6Var = (tv6) f89Var;
                float f4 = tv6Var.F;
                h6 h6Var = tv6Var.H;
                ImageView imageView2 = tv6Var.A;
                View view2 = tv6Var.z;
                CheckBox checkBox = tv6Var.E;
                jw6 jw6Var2 = (jw6) sv6Var2.a;
                uv6 uv6Var2 = tv6Var.I;
                wv6 wv6Var2 = uv6Var2.x;
                if (jw6Var2 == wv6Var2.r && DesugarCollections.unmodifiableList(jw6Var2.v).size() > 0) {
                    Iterator it = DesugarCollections.unmodifiableList(jw6Var2.v).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        jw6 jw6Var3 = (jw6) it.next();
                        if (!wv6Var2.w.contains(jw6Var3)) {
                            jw6Var2 = jw6Var3;
                            break;
                        }
                    }
                }
                tv6Var.t(jw6Var2);
                imageView2.setImageDrawable(uv6Var2.E(jw6Var2));
                tv6Var.C.setText(jw6Var2.d);
                checkBox.setVisibility(0);
                boolean v = tv6Var.v(jw6Var2);
                if (wv6Var2.y.contains(jw6Var2) || ((tv6Var.v(jw6Var2) && DesugarCollections.unmodifiableList(wv6Var2.r.v).size() < 2) || (tv6Var.v(jw6Var2) && ((b = wv6Var2.r.b(jw6Var2)) == null || ((yv6Var = (yv6) b.b) != null && !yv6Var.c))))) {
                    z = false;
                } else {
                    z = true;
                }
                checkBox.setChecked(v);
                tv6Var.B.setVisibility(4);
                imageView2.setVisibility(0);
                view2.setEnabled(z);
                checkBox.setEnabled(z);
                ImageButton imageButton = tv6Var.w;
                if (!z && !v) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                imageButton.setEnabled(z2);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = tv6Var.x;
                if (!z && !v) {
                    z3 = false;
                }
                mediaRouteVolumeSlider.setEnabled(z3);
                view2.setOnClickListener(h6Var);
                checkBox.setOnClickListener(h6Var);
                RelativeLayout relativeLayout = tv6Var.D;
                if (v && !tv6Var.v.e()) {
                    i2 = tv6Var.G;
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = i2;
                relativeLayout.setLayoutParams(layoutParams);
                if (!z && !v) {
                    f = f4;
                } else {
                    f = 1.0f;
                }
                view2.setAlpha(f);
                if (!z && v) {
                    f2 = f4;
                } else {
                    f2 = 1.0f;
                }
                checkBox.setAlpha(f2);
                return;
            }
            ((rv6) f89Var).v.setText(sv6Var2.a.toString());
            return;
        }
        wv6Var.M.put(((jw6) sv6Var2.a).c, (ov6) f89Var);
        qv6 qv6Var = (qv6) f89Var;
        View view3 = qv6Var.a;
        wv6 wv6Var3 = qv6Var.B.x;
        if (wv6Var3.j0 && DesugarCollections.unmodifiableList(wv6Var3.r.v).size() > 1) {
            i2 = qv6Var.A;
        }
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = i2;
        view3.setLayoutParams(layoutParams2);
        jw6 jw6Var4 = (jw6) sv6Var2.a;
        qv6Var.t(jw6Var4);
        qv6Var.z.setText(jw6Var4.d);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new pv6(this, layoutInflater.inflate(2131492923, viewGroup, false));
                    }
                    grb.g();
                    return null;
                }
                return new tv6(this, layoutInflater.inflate(2131492927, viewGroup, false));
            }
            return new rv6(layoutInflater.inflate(2131492925, viewGroup, false));
        }
        return new qv6(this, layoutInflater.inflate(2131492924, viewGroup, false));
    }
}
