package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_agent;
public final class wc extends LinearLayout {
    public final vc a;
    public final r59 b;
    public final uc c;
    public final View d;
    public final View e;
    public final LinearLayout f;
    public final io h;
    public final rc n;
    public int r;
    public final ad s;

    public wc(ad adVar, Context context) {
        super(context);
        int i;
        int i2;
        boolean o;
        int i3;
        int i4;
        int i5;
        this.s = adVar;
        this.r = -1;
        setOrientation(1);
        int i6 = cmb.D8;
        ylb ylbVar = adVar.d;
        int v0 = cmb.v0(i6, ylbVar);
        int p1 = cmb.p1(0.5f, v0);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView k = td4.k(context, 2131232754);
        k.setScaleType(ImageView.ScaleType.CENTER);
        k.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        frameLayout.addView(k, qoe.d(24, 24.0f, i | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        vc vcVar = new vc(context, (byte) 0);
        this.a = vcVar;
        vcVar.setTextSize(1, 16.0f);
        vcVar.setTextColor(v0);
        vcVar.setHintTextColor(p1);
        vcVar.setCursorColor(cmb.v0(cmb.Ei, ylbVar));
        vcVar.setCursorSize(gm.L(18.0f));
        vcVar.setCursorWidth(1.5f);
        vcVar.setBackground(null);
        vcVar.setPadding(0, 0, 0, 0);
        vcVar.setSingleLine();
        vcVar.setInputType(524289);
        vcVar.setImeOptions(268435459);
        vcVar.setHint(jb6.M0(2131754284, null));
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        vcVar.setGravity(i2 | 16);
        vcVar.setOnEditorActionListener(new j(this, (byte) 2));
        vcVar.addTextChangedListener(new b7(this, (byte) 1));
        frameLayout.addView(vcVar, qoe.d(-1, -1.0f, 119, 52.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, qoe.o(-1, 48));
        View view = new View(context);
        this.d = view;
        view.setBackgroundColor(cmb.p1(0.1f, v0));
        addView(view, new LinearLayout.LayoutParams(-1, Math.max(1, gm.L(0.5f))));
        r59 r59Var = new r59(context, ylbVar);
        this.b = r59Var;
        r59Var.setLayoutManager(new u46());
        uc ucVar = new uc(adVar);
        this.c = ucVar;
        r59Var.setAdapter(ucVar);
        r59Var.setVerticalScrollBarEnabled(false);
        r59Var.setOverScrollMode(2);
        r59Var.setItemAnimator(null);
        r59Var.setClipToPadding(false);
        r59Var.setPadding(0, gm.L(2.0f), 0, gm.L(2.0f));
        r59Var.setSelectorDrawableColor(cmb.p1(0.06f, v0));
        r59Var.setOnItemClickListener(new u(this, (byte) 3));
        r59Var.j(new y(this, (byte) 2));
        addView(r59Var, qoe.o(-1, 0));
        View view2 = new View(context);
        this.e = view2;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        if (o) {
            i3 = 1023410176;
        } else {
            i3 = 251658240;
        }
        view2.setBackgroundColor(i3);
        addView(view2, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 8));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(14.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(v0);
        textView.setText(jb6.M0(2131754292, null));
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        frameLayout2.addView(textView, qoe.e(-2, -2, i4 | 16));
        io ioVar = new io(context, false, true, true);
        this.h = ioVar;
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(v0);
        if (jb6.a0) {
            i5 = 3;
        } else {
            i5 = 5;
        }
        ioVar.setGravity(i5);
        ioVar.b(0.6f, 240L, d53.h);
        frameLayout2.addView(ioVar, qoe.e(120, 20, (jb6.a0 ? 3 : 5) | 16));
        linearLayout.addView(frameLayout2, qoe.o(-1, 20));
        rc rcVar = new rc(context, ylbVar);
        this.n = rcVar;
        rcVar.setListener(new l0(this, (byte) 9));
        linearLayout.addView(rcVar, qoe.k(-14.0f, -4.0f, -14.0f, -14.0f, -1, 56));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, qoe.o(-1, 84));
    }

    public final void a() {
        u46 u46Var;
        ad adVar = this.s;
        if (!adVar.K && !adVar.J && (u46Var = (u46) this.b.getLayoutManager()) != null && u46Var.M0() >= this.c.b() - 4) {
            adVar.j(false);
        }
    }

    public final void b(int i, boolean z) {
        boolean z2;
        String M0;
        int i2 = this.r;
        if (i2 == i) {
            return;
        }
        boolean z3 = false;
        if (i > i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.r = i;
        String str = mc.i[i];
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1289163222:
                if (str.equals("expert")) {
                    c = 0;
                    break;
                }
                break;
            case 3135580:
                if (str.equals("fast")) {
                    c = 1;
                    break;
                }
                break;
            case 111384492:
                if (str.equals("ultra")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                M0 = jb6.M0(2131754291, null);
                break;
            case 1:
                M0 = jb6.M0(2131754290, null);
                break;
            case 2:
                M0 = jb6.M0(2131754287, null);
                break;
            default:
                M0 = jb6.M0(2131754289, null);
                break;
        }
        if (z && isAttachedToWindow()) {
            z3 = true;
        }
        this.h.c(M0, z3, !z2);
    }

    public final void c() {
        boolean z;
        ad adVar = this.s;
        ArrayList arrayList = adVar.Q;
        ArrayList arrayList2 = adVar.S;
        arrayList2.clear();
        if (TextUtils.isEmpty(adVar.H) && !arrayList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList2.add(new xc(3, null, jb6.M0(2131754281, null)));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_agent.agentModel agentmodel = (TL_agent.agentModel) obj;
                TL_agent.agentModel e = ad.e(agentmodel.id, adVar.N);
                if (e != null) {
                    agentmodel = e;
                }
                arrayList2.add(new xc(0, agentmodel, null));
            }
            arrayList2.add(new xc(3, null, jb6.M0(2131754283, null)));
        }
        ArrayList arrayList3 = adVar.G;
        int size2 = arrayList3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            TL_agent.agentModel agentmodel2 = (TL_agent.agentModel) obj2;
            if (!z || ad.e(agentmodel2.id, arrayList) == null) {
                arrayList2.add(new xc(0, agentmodel2, null));
                i2++;
            }
        }
        if (!adVar.K && adVar.J) {
            if (i2 == 0 && !z) {
                arrayList2.add(new xc(2, null, null));
            }
        } else {
            arrayList2.add(new xc(1, null, null));
        }
        this.c.f();
        requestLayout();
    }

    public final void d(boolean z) {
        int i;
        float f;
        ad adVar = this.s;
        TL_agent.settings settingsVar = adVar.y.d;
        boolean z2 = false;
        if (settingsVar != null && settingsVar.effort_supported) {
            i = 0;
        } else {
            i = 8;
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout.getVisibility() != i) {
            this.e.setVisibility(i);
            linearLayout.setVisibility(i);
            requestLayout();
        }
        String b = adVar.y.b();
        int i2 = 0;
        while (true) {
            if (i2 < 4) {
                if (TextUtils.equals(mc.i[i2], b)) {
                    break;
                }
                i2++;
            } else {
                i2 = 1;
                break;
            }
        }
        b(i2, z);
        rc rcVar = this.n;
        if (!rcVar.E && !rcVar.F) {
            ValueAnimator valueAnimator = rcVar.s;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                float f2 = i2;
                if (Math.abs(rcVar.e - f2) >= 0.001f) {
                    if (z) {
                        rcVar.a(i2);
                        return;
                    }
                    rcVar.e = f2;
                    if (f2 > rcVar.b - 1.5f) {
                        z2 = true;
                    }
                    rcVar.r = z2;
                    if (z2) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    rcVar.n = f;
                    rcVar.invalidate();
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size;
        int L;
        int max = Math.max(1, gm.L(0.5f)) + gm.L(48.0f);
        ad adVar = this.s;
        TL_agent.settings settingsVar = adVar.y.d;
        if (settingsVar != null && settingsVar.effort_supported) {
            max += gm.L(96.0f);
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = Integer.MAX_VALUE;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        int L2 = gm.L(4.0f);
        ArrayList arrayList = adVar.S;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            byte b = ((xc) obj).a;
            if (b != 2) {
                if (b != 3) {
                    L = gm.L(55.0f);
                } else {
                    L = gm.L(26.0f);
                }
            } else {
                L = gm.L(48.0f);
            }
            L2 += L;
            if (L2 > gm.L(305.0f)) {
                break;
            }
        }
        if (!adVar.J || adVar.K) {
            L2 = gm.L(305.0f);
        }
        int max2 = Math.max(gm.L(55.0f), Math.min(Math.min(L2, gm.L(305.0f)), size - max));
        this.b.getLayoutParams().height = max2;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(max + max2, 1073741824));
    }
}
