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
public final class pt6 extends w39 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public nt6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final rt6 x;

    public pt6(rt6 rt6Var) {
        this.x = rt6Var;
        Context context = rt6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = voe.d(context, 2130968868);
        this.f = voe.d(context, 2130968877);
        this.h = voe.d(context, 2130968874);
        this.n = voe.d(context, 2130968873);
        this.s = context.getResources().getInteger(2131361803);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override
    public final void A(s49 s49Var) {
        this.x.M.values().remove(s49Var);
    }

    public final void D(int i, View view) {
        ps6 ps6Var = new ps6(i, view.getLayoutParams().height, view, (byte) 1);
        ps6Var.setAnimationListener(new ld(this, (byte) 2));
        ps6Var.setDuration(this.s);
        ps6Var.setInterpolator(this.w);
        view.startAnimation(ps6Var);
    }

    public final Drawable E(eu6 eu6Var) {
        Uri uri = eu6Var.f;
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
        int i = eu6Var.n;
        if (i != 1) {
            if (i != 2) {
                if (eu6Var.e()) {
                    return this.n;
                }
                return this.e;
            }
            return this.h;
        }
        return this.f;
    }

    public final void F() {
        tt6 tt6Var;
        rt6 rt6Var = this.x;
        ArrayList arrayList = rt6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = rt6Var.w;
        ArrayList arrayList3 = new ArrayList();
        du6 du6Var = rt6Var.r.a;
        gu6.b();
        for (eu6 eu6Var : DesugarCollections.unmodifiableList(du6Var.b)) {
            pj4 b = rt6Var.r.b(eu6Var);
            if (b != null && (tt6Var = (tt6) b.b) != null && tt6Var.d) {
                arrayList3.add(eu6Var);
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
        rt6 rt6Var = this.x;
        ArrayList arrayList2 = rt6Var.x;
        Context context = rt6Var.E;
        ArrayList arrayList3 = rt6Var.w;
        this.r = new nt6(rt6Var.r, 1);
        ArrayList arrayList4 = rt6Var.s;
        boolean z = false;
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new nt6((eu6) obj, 3));
            }
        } else {
            arrayList.add(new nt6(rt6Var.r, 3));
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                eu6 eu6Var = (eu6) obj2;
                if (!arrayList4.contains(eu6Var)) {
                    if (!z2) {
                        rt6Var.r.getClass();
                        ut6 a = eu6.a();
                        if (a != null) {
                            str2 = a.j();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = context.getString(2131689664);
                        }
                        arrayList.add(new nt6(str2, 2));
                        z2 = true;
                    }
                    arrayList.add(new nt6(eu6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                eu6 eu6Var2 = (eu6) obj3;
                eu6 eu6Var3 = rt6Var.r;
                if (eu6Var3 != eu6Var2) {
                    if (!z) {
                        eu6Var3.getClass();
                        ut6 a2 = eu6.a();
                        if (a2 != null) {
                            str = a2.k();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = context.getString(2131689665);
                        }
                        arrayList.add(new nt6(str, 2));
                        z = true;
                    }
                    arrayList.add(new nt6(eu6Var2, 4));
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
        nt6 nt6Var;
        if (i == 0) {
            nt6Var = this.r;
        } else {
            nt6Var = (nt6) this.c.get(i - 1);
        }
        return nt6Var.b;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        nt6 nt6Var;
        nt6 nt6Var2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        pj4 b;
        tt6 tt6Var;
        float f3;
        ArrayList arrayList = this.c;
        if (i == 0) {
            nt6Var = this.r;
        } else {
            nt6Var = (nt6) arrayList.get(i - 1);
        }
        byte b2 = nt6Var.b;
        boolean z3 = true;
        if (i == 0) {
            nt6Var2 = this.r;
        } else {
            nt6Var2 = (nt6) arrayList.get(i - 1);
        }
        rt6 rt6Var = this.x;
        int i2 = 0;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        kt6 kt6Var = (kt6) s49Var;
                        View view = kt6Var.v;
                        eu6 eu6Var = (eu6) nt6Var2.a;
                        kt6Var.A = eu6Var;
                        ImageView imageView = kt6Var.w;
                        imageView.setVisibility(0);
                        kt6Var.x.setVisibility(4);
                        pt6 pt6Var = kt6Var.B;
                        List unmodifiableList = DesugarCollections.unmodifiableList(pt6Var.x.r.v);
                        if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == eu6Var) {
                            f3 = kt6Var.z;
                        } else {
                            f3 = 1.0f;
                        }
                        view.setAlpha(f3);
                        view.setOnClickListener(new g6(kt6Var, (byte) 11));
                        imageView.setImageDrawable(pt6Var.E(eu6Var));
                        kt6Var.y.setText(eu6Var.d);
                        return;
                    }
                    sdb.a();
                    return;
                }
                rt6Var.M.put(((eu6) nt6Var2.a).c, (jt6) s49Var);
                ot6 ot6Var = (ot6) s49Var;
                float f4 = ot6Var.F;
                g6 g6Var = ot6Var.H;
                ImageView imageView2 = ot6Var.A;
                View view2 = ot6Var.z;
                CheckBox checkBox = ot6Var.E;
                eu6 eu6Var2 = (eu6) nt6Var2.a;
                pt6 pt6Var2 = ot6Var.I;
                rt6 rt6Var2 = pt6Var2.x;
                if (eu6Var2 == rt6Var2.r && DesugarCollections.unmodifiableList(eu6Var2.v).size() > 0) {
                    Iterator it = DesugarCollections.unmodifiableList(eu6Var2.v).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        eu6 eu6Var3 = (eu6) it.next();
                        if (!rt6Var2.w.contains(eu6Var3)) {
                            eu6Var2 = eu6Var3;
                            break;
                        }
                    }
                }
                ot6Var.t(eu6Var2);
                imageView2.setImageDrawable(pt6Var2.E(eu6Var2));
                ot6Var.C.setText(eu6Var2.d);
                checkBox.setVisibility(0);
                boolean v = ot6Var.v(eu6Var2);
                if (rt6Var2.y.contains(eu6Var2) || ((ot6Var.v(eu6Var2) && DesugarCollections.unmodifiableList(rt6Var2.r.v).size() < 2) || (ot6Var.v(eu6Var2) && ((b = rt6Var2.r.b(eu6Var2)) == null || ((tt6Var = (tt6) b.b) != null && !tt6Var.c))))) {
                    z = false;
                } else {
                    z = true;
                }
                checkBox.setChecked(v);
                ot6Var.B.setVisibility(4);
                imageView2.setVisibility(0);
                view2.setEnabled(z);
                checkBox.setEnabled(z);
                ImageButton imageButton = ot6Var.w;
                if (!z && !v) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                imageButton.setEnabled(z2);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = ot6Var.x;
                if (!z && !v) {
                    z3 = false;
                }
                mediaRouteVolumeSlider.setEnabled(z3);
                view2.setOnClickListener(g6Var);
                checkBox.setOnClickListener(g6Var);
                RelativeLayout relativeLayout = ot6Var.D;
                if (v && !ot6Var.v.e()) {
                    i2 = ot6Var.G;
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
            ((mt6) s49Var).v.setText(nt6Var2.a.toString());
            return;
        }
        rt6Var.M.put(((eu6) nt6Var2.a).c, (jt6) s49Var);
        lt6 lt6Var = (lt6) s49Var;
        View view3 = lt6Var.a;
        rt6 rt6Var3 = lt6Var.B.x;
        if (rt6Var3.j0 && DesugarCollections.unmodifiableList(rt6Var3.r.v).size() > 1) {
            i2 = lt6Var.A;
        }
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = i2;
        view3.setLayoutParams(layoutParams2);
        eu6 eu6Var4 = (eu6) nt6Var2.a;
        lt6Var.t(eu6Var4);
        lt6Var.z.setText(eu6Var4.d);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new kt6(this, layoutInflater.inflate(2131492923, viewGroup, false));
                    }
                    sdb.a();
                    return null;
                }
                return new ot6(this, layoutInflater.inflate(2131492927, viewGroup, false));
            }
            return new mt6(layoutInflater.inflate(2131492925, viewGroup, false));
        }
        return new lt6(this, layoutInflater.inflate(2131492924, viewGroup, false));
    }
}
