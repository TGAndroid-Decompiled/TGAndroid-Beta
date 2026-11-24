package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public class f56 extends LinearLayout {
    public boolean E;
    public c56 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView a;
    public String b;
    public final d c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final FrameLayout n;
    public e56 r;
    public m8 s;
    public final ec0 w;
    public int x;
    public boolean y;

    public f56(Context context, final d dVar, my0 my0Var, boolean z, boolean z2) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.c = dVar;
        this.y = z;
        this.I = z2;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(gm.L(18.0f), gm.L(13.0f), gm.L(40.0f), gm.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231248));
        imageView.setContentDescription(jb6.M0(2131754838, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, qoe.e(40, 48, 21));
        addView(frameLayout, qoe.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        rve.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new pn2(0, context.getDrawable(2131232110)), 0, 1, 0);
        spannableStringBuilder.setSpan(new fg3(gm.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131748683, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(jb6.M0(2131748683, null));
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setSingleLine(true);
        TextView m = wi8.m(linearLayout, textView2, qoe.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = m;
        rve.b(m, 0.025f, 1.2f);
        m.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new pn2(0, context.getDrawable(2131232370)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new fg3(gm.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131748682, null));
        m.setText(spannableStringBuilder2);
        m.setContentDescription(jb6.M0(2131748682, null));
        m.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        m.setTextSize(1, 14.0f);
        m.setTypeface(gm.o());
        m.setSingleLine(true);
        TextView m2 = wi8.m(linearLayout, m, qoe.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = m2;
        rve.b(m2, 0.025f, 1.2f);
        m2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new pn2(0, context.getDrawable(2131232116)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new fg3(gm.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) jb6.M0(2131751471, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new fg3(gm.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        m2.setText(spannableStringBuilder3);
        m2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        m2.setTextSize(1, 14.0f);
        m2.setTypeface(gm.o());
        m2.setSingleLine(true);
        linearLayout.addView(m2, qoe.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        m2.setVisibility(8);
        addView(linearLayout, qoe.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        ec0 ec0Var = new ec0(this, context);
        this.w = ec0Var;
        ((d56) ec0Var.c).setAvatarsTextSize(gm.L(18.0f));
        addView(ec0Var, qoe.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new jw4(this, my0Var, dVar, (byte) 5));
        if (z) {
            ec0Var.setOnClickListener(new z46(this, (byte) 0));
        }
        m.setOnClickListener(new View.OnClickListener(this) {
            public final f56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        f56 f56Var = this.b;
                        try {
                            if (f56Var.b != null) {
                                Context context2 = f56Var.getContext();
                                String str = f56Var.b;
                                dVar2.showDialog(new b56(f56Var, context2, str, str, dVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                        String M0 = jb6.M0(2131751471, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131751470, null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new y46(this.b, (byte) 0));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        dVar2.showDialog(heVar);
                        return;
                }
            }
        });
        m2.setOnClickListener(new View.OnClickListener(this) {
            public final f56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        f56 f56Var = this.b;
                        try {
                            if (f56Var.b != null) {
                                Context context2 = f56Var.getContext();
                                String str = f56Var.b;
                                dVar2.showDialog(new b56(f56Var, context2, str, str, dVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                        String M0 = jb6.M0(2131751471, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131751470, null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new y46(this.b, (byte) 0));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        dVar2.showDialog(heVar);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new ef(this, context, my0Var, dVar, (byte) 11));
        frameLayout.setOnClickListener(new g6(this, (byte) 8));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f = 0.0f;
        float f2 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y = frameLayout3.getY() + f;
            f2 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y -= frameLayout3.getScrollY();
            }
            f = y;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r3 = (View) frameLayout3.getParent();
            boolean z = r3 instanceof ViewGroup;
            frameLayout3 = r3;
            if (!z) {
                return;
            }
        }
        fArr[0] = f2 - frameLayout2.getPaddingLeft();
        fArr[1] = f - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z) {
        if (this.G != z) {
            this.G = z;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(2131231248));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.M, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.E) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = oc7.r1(z8c.t0).i1(-j);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_messages_getChatInviteImporters, new cx3(this, tL_chatInviteExported, (byte) 15));
            }
        }
    }

    public final void d(int i, ArrayList arrayList, boolean z) {
        this.x = i;
        ec0 ec0Var = this.w;
        if (i == 0) {
            ec0Var.setVisibility(8);
            setPadding(gm.L(19.0f), gm.L(18.0f), gm.L(19.0f), gm.L(18.0f));
        } else {
            ec0Var.setVisibility(0);
            setPadding(gm.L(19.0f), gm.L(18.0f), gm.L(19.0f), gm.L(10.0f));
            ((TextView) ec0Var.b).setText(jb6.G(i, "PeopleJoined", new Object[0]));
            ec0Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                oc7.r1(z8c.t0).c4((TLRPC.User) arrayList.get(i2), false, false);
            }
            int min = Math.min(3, Math.min(i, arrayList.size()));
            ((d56) ec0Var.c).setCount(min);
            for (int i3 = 0; i3 < min; i3++) {
                ((d56) ec0Var.c).b(i3, z8c.t0, (TLObject) arrayList.get(i3));
            }
        } else {
            ((d56) ec0Var.c).setCount(0);
        }
        ((d56) ec0Var.c).a(z);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        u31 Q = c41.b0(this.c).Q(2131624029, 36, spannableStringBuilder);
        Q.s = false;
        Q.k(true);
    }

    public final void f() {
        boolean z = this.L;
        ImageView imageView = this.d;
        TextView textView = this.a;
        FrameLayout frameLayout = this.n;
        TextView textView2 = this.h;
        TextView textView3 = this.f;
        TextView textView4 = this.e;
        ec0 ec0Var = this.w;
        if (z) {
            anb.a0(textView4);
            anb.a0(textView3);
            anb.a0(textView2);
            anb.a0(frameLayout);
            anb.a0(textView);
            anb.a0(imageView);
            anb.a0((TextView) ec0Var.b);
            anb.a0(ec0Var);
            c56 c56Var = this.F;
            if (c56Var != null) {
                c56Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i = cmb.Ii;
        anb.X(textView4, i, null);
        anb.X(textView3, i, null);
        anb.X(textView2, i, null);
        int L = gm.L(21.0f);
        int i2 = cmb.Ei;
        int w0 = cmb.w0(null, i2, false);
        int i3 = cmb.Gi;
        int w02 = cmb.w0(null, i3, false);
        anb.R(textView4, cmb.i0(L, L, L, L, w0, w02, w02), anb.M(i2), anb.M(i3), null);
        int L2 = gm.L(21.0f);
        int w03 = cmb.w0(null, i2, false);
        int w04 = cmb.w0(null, i3, false);
        anb.R(textView3, cmb.i0(L2, L2, L2, L2, w03, w04, w04), anb.M(i2), anb.M(i3), null);
        int L3 = gm.L(21.0f);
        int i4 = cmb.ja;
        int w05 = cmb.w0(null, i4, false);
        int i5 = cmb.c6;
        int p = on2.p(cmb.w0(null, i5, false), 120);
        anb.R(textView2, cmb.i0(L3, L3, L3, L3, w05, p, p), anb.M(i4), anb.g(i5, 120), null);
        int L4 = gm.L(21.0f);
        int i6 = cmb.d7;
        int w06 = cmb.w0(null, i6, false);
        int i7 = cmb.h6;
        int p2 = on2.p(cmb.w0(null, i7, false), 76);
        anb.R(frameLayout, cmb.i0(L4, L4, L4, L4, w06, p2, p2), anb.M(i6), anb.g(i7, 76), null);
        anb.X(textView, cmb.F6, null);
        anb.s(imageView, cmb.q5, null, PorterDuff.Mode.SRC_ATOP);
        int i8 = cmb.m6;
        anb.X((TextView) ec0Var.b, i8, null);
        int L5 = gm.L(6.0f);
        int p3 = on2.p(cmb.w0(null, i8, false), 76);
        fg0 i0 = cmb.i0(L5, L5, L5, L5, 0, p3, p3);
        wmb g = anb.g(i8, 76);
        ec0Var.setBackground(i0);
        anb.j(ec0Var, i0, null, g, null);
        c56 c56Var2 = this.F;
        if (c56Var2 != null) {
            c56Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z) {
        this.H = z;
    }

    public void setDelegate(e56 e56Var) {
        this.r = e56Var;
    }

    public void setLink(String str) {
        this.b = str;
        TextView textView = this.a;
        if (str == null) {
            textView.setText(jb6.M0(2131748536, null));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z) {
        this.y = z;
    }

    public void setQrText(String str) {
        this.K = str;
    }

    public void setRevoke(boolean z) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f;
        ImageView imageView = this.d;
        if (z) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
