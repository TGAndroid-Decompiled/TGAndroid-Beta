package lh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class u4 implements Runnable {

    public final int f16903a;

    public final f6 f16904b;

    public final zf.j f16905c;

    public u4(f6 f6Var, zf.j jVar, int i10) {
        this.f16903a = i10;
        this.f16904b = f6Var;
        this.f16905c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f16903a) {
            case 0:
                this.f16904b.C0(this.f16905c);
                break;
            default:
                final f6 f6Var = this.f16904b;
                z5 z5Var = f6Var.N0;
                i5 i5Var = f6Var.K1;
                t5 t5Var = f6Var.C1;
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(0);
                final zf.j jVar = this.f16905c;
                boolean z10 = jVar instanceof zf.e1;
                if (!z10) {
                    TextView textView = new TextView(f6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, t5Var));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    final int i10 = 0;
                    textView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i10) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, h7.z5.n(-2, 44));
                }
                if (jVar instanceof zf.v2) {
                    TextView textView2 = new TextView(f6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, t5Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!i5Var.c() || i5Var.d) && f6Var.f15987p2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                zf.j jVar2;
                                switch (i11) {
                                    case 0:
                                        zf.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof zf.c2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            f6Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            f6Var2.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        zf.j jVar4 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            f6Var3.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.D0(jVar, true);
                                        f6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            f6Var4.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.D0(null, true);
                                        zf.j jVar5 = jVar;
                                        f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            f6Var5.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.D0(null, true);
                                        f6Var6.K0((zf.p0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            f6Var6.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        zf.j jVar6 = jVar;
                                        if (jVar6 instanceof zf.o2) {
                                            ((zf.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof zf.b2) {
                                            ((zf.b2) jVar6).r(true);
                                        } else if (jVar6 instanceof zf.c2) {
                                            zf.c2 c2Var = (zf.c2) jVar6;
                                            c2Var.f50360n0 = !c2Var.f50360n0;
                                            c2Var.invalidate();
                                        } else {
                                            ((zf.x1) jVar6).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            f6Var7.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            f6Var8.D1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.N0;
                                        zf.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF pointFQ0 = f6Var9.Q0(jVar7);
                                            if (jVar7 instanceof zf.o2) {
                                                zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.g0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof zf.v2) {
                                                zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                                v2Var.setDelegate(f6Var9);
                                                v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                                f6Var9.g0();
                                                jVar2 = v2Var;
                                            }
                                            f6Var9.B0(jVar2);
                                            f6Var9.D0(null, true);
                                            f6Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            f6Var9.D1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        final int i12 = 1;
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                zf.j jVar2;
                                switch (i12) {
                                    case 0:
                                        zf.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof zf.c2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            f6Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                        if (n1Var != null && n1Var.isShowing()) {
                                            f6Var2.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        zf.j jVar4 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                        if (n1Var2 != null && n1Var2.isShowing()) {
                                            f6Var3.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.D0(jVar, true);
                                        f6Var4.r0();
                                        org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                        if (n1Var3 != null && n1Var3.isShowing()) {
                                            f6Var4.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.D0(null, true);
                                        zf.j jVar5 = jVar;
                                        f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                        org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                        if (n1Var4 != null && n1Var4.isShowing()) {
                                            f6Var5.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.D0(null, true);
                                        f6Var6.K0((zf.p0) jVar);
                                        org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                        if (n1Var5 != null && n1Var5.isShowing()) {
                                            f6Var6.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        zf.j jVar6 = jVar;
                                        if (jVar6 instanceof zf.o2) {
                                            ((zf.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof zf.b2) {
                                            ((zf.b2) jVar6).r(true);
                                        } else if (jVar6 instanceof zf.c2) {
                                            zf.c2 c2Var = (zf.c2) jVar6;
                                            c2Var.f50360n0 = !c2Var.f50360n0;
                                            c2Var.invalidate();
                                        } else {
                                            ((zf.x1) jVar6).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                        if (n1Var6 != null && n1Var6.isShowing()) {
                                            f6Var7.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                        if (n1Var7 != null && n1Var7.isShowing()) {
                                            f6Var8.D1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.N0;
                                        zf.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF pointFQ0 = f6Var9.Q0(jVar7);
                                            if (jVar7 instanceof zf.o2) {
                                                zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.g0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof zf.v2) {
                                                zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                                v2Var.setDelegate(f6Var9);
                                                v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                                f6Var9.g0();
                                                jVar2 = v2Var;
                                            }
                                            f6Var9.B0(jVar2);
                                            f6Var9.D0(null, true);
                                            f6Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                        if (n1Var8 != null && n1Var8.isShowing()) {
                                            f6Var9.D1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, h7.z5.n(-2, 44));
                } else if (jVar instanceof zf.s0) {
                    TextView textViewH0 = f6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    textViewH0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i13) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewH0, h7.z5.n(-2, 44));
                } else if (jVar instanceof zf.p0) {
                    TextView textViewH1 = f6Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    textViewH1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i14) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewH1, h7.z5.n(-2, 44));
                }
                if ((jVar instanceof zf.o2) || (jVar instanceof zf.c2) || (jVar instanceof zf.x1) || (jVar instanceof zf.b2)) {
                    TextView textViewH2 = f6Var.h0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    textViewH2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i15) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textViewH2, h7.z5.n(-2, 44));
                }
                boolean z11 = jVar instanceof zf.x1;
                if (z5Var.indexOfChild(jVar) != z5Var.getChildCount() - 1 && !(jVar instanceof zf.b2)) {
                    TextView textView3 = new TextView(f6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, t5Var));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i16) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z12 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z12) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, h7.z5.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof zf.c2) && !(jVar instanceof zf.s0) && !(jVar instanceof zf.w2) && !(jVar instanceof zf.p0) && !(jVar instanceof zf.b2)) {
                    TextView textView4 = new TextView(f6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, t5Var));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zf.j jVar2;
                            switch (i17) {
                                case 0:
                                    zf.j jVar3 = jVar;
                                    boolean z12 = jVar3 instanceof zf.c2;
                                    f6 f6Var2 = f6Var;
                                    if (z12) {
                                        ib ibVar = ((va) f6Var2).f16954w2.Y0;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        f6Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var = f6Var2.D1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        f6Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    zf.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((zf.v2) jVar4).getEditText().onTextContextMenuItem(16908337);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var2 = f6Var3.D1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        f6Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.D0(jVar, true);
                                    f6Var4.r0();
                                    org.telegram.ui.ActionBar.n1 n1Var3 = f6Var4.D1;
                                    if (n1Var3 != null && n1Var3.isShowing()) {
                                        f6Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.D0(null, true);
                                    zf.j jVar5 = jVar;
                                    f6Var5.L0((zf.s0) jVar5, new cg.u0(8, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.n1 n1Var4 = f6Var5.D1;
                                    if (n1Var4 != null && n1Var4.isShowing()) {
                                        f6Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.D0(null, true);
                                    f6Var6.K0((zf.p0) jVar);
                                    org.telegram.ui.ActionBar.n1 n1Var5 = f6Var6.D1;
                                    if (n1Var5 != null && n1Var5.isShowing()) {
                                        f6Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    zf.j jVar6 = jVar;
                                    if (jVar6 instanceof zf.o2) {
                                        ((zf.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.b2) {
                                        ((zf.b2) jVar6).r(true);
                                    } else if (jVar6 instanceof zf.c2) {
                                        zf.c2 c2Var = (zf.c2) jVar6;
                                        c2Var.f50360n0 = !c2Var.f50360n0;
                                        c2Var.invalidate();
                                    } else {
                                        ((zf.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.n1 n1Var6 = f6Var7.D1;
                                    if (n1Var6 != null && n1Var6.isShowing()) {
                                        f6Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.n1 n1Var7 = f6Var8.D1;
                                    if (n1Var7 != null && n1Var7.isShowing()) {
                                        f6Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.N0;
                                    zf.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF pointFQ0 = f6Var9.Q0(jVar7);
                                        if (jVar7 instanceof zf.o2) {
                                            zf.j o2Var = new zf.o2(f6Var9.getContext(), (zf.o2) jVar7, pointFQ0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof zf.v2) {
                                            zf.v2 v2Var = new zf.v2(f6Var9.getContext(), (zf.v2) jVar7, pointFQ0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.N1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, h7.z5.c(-2.0f, -2));
                                            f6Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.B0(jVar2);
                                        f6Var9.D0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.n1 n1Var8 = f6Var9.D1;
                                    if (n1Var8 != null && n1Var8.isShowing()) {
                                        f6Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, h7.z5.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, t5Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.g6.a0(iV0, i20, i21, i22, i19));
                    i18++;
                }
                f6Var.E1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
