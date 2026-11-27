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
import org.telegram.ui.ActionBar.e;
public class i56 extends LinearLayout {
    public boolean E;
    public f56 F;
    public boolean G;
    public boolean H;
    public final boolean I;
    public final float[] J;
    public String K;
    public boolean L;
    public String M;
    public final TextView a;
    public String b;
    public final e c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final FrameLayout n;
    public h56 r;
    public n8 s;
    public final gb0 w;
    public int x;
    public boolean y;

    public i56(Context context, final e eVar, nx0 nx0Var, boolean z, boolean z2) {
        super(context);
        this.H = true;
        this.J = new float[2];
        this.c = eVar;
        this.y = z;
        this.I = z2;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(hl.L(18.0f), hl.L(13.0f), hl.L(40.0f), hl.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231247));
        imageView.setContentDescription(ob6.M0(2131754834, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, tre.e(40, 48, 21));
        addView(frameLayout, tre.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        iye.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new wm2(0, context.getDrawable(2131232109)), 0, 1, 0);
        spannableStringBuilder.setSpan(new mf3(hl.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131748680, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(ob6.M0(2131748680, null));
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setSingleLine(true);
        TextView m = ik8.m(linearLayout, textView2, tre.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = m;
        iye.b(m, 0.025f, 1.2f);
        m.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new wm2(0, context.getDrawable(2131232369)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new mf3(hl.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131748679, null));
        m.setText(spannableStringBuilder2);
        m.setContentDescription(ob6.M0(2131748679, null));
        m.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        m.setTextSize(1, 14.0f);
        m.setTypeface(hl.o());
        m.setSingleLine(true);
        TextView m2 = ik8.m(linearLayout, m, tre.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = m2;
        iye.b(m2, 0.025f, 1.2f);
        m2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new wm2(0, context.getDrawable(2131232115)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new mf3(hl.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) ob6.M0(2131751499, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new mf3(hl.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        m2.setText(spannableStringBuilder3);
        m2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        m2.setTextSize(1, 14.0f);
        m2.setTypeface(hl.o());
        m2.setSingleLine(true);
        linearLayout.addView(m2, tre.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        m2.setVisibility(8);
        addView(linearLayout, tre.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        gb0 gb0Var = new gb0(this, context);
        this.w = gb0Var;
        ((g56) gb0Var.c).setAvatarsTextSize(hl.L(18.0f));
        addView(gb0Var, tre.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new lw4(this, nx0Var, eVar, (byte) 6));
        if (z) {
            gb0Var.setOnClickListener(new c56(this, (byte) 0));
        }
        m.setOnClickListener(new View.OnClickListener(this) {
            public final i56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        i56 i56Var = this.b;
                        try {
                            if (i56Var.b != null) {
                                Context context2 = i56Var.getContext();
                                String str = i56Var.b;
                                eVar2.showDialog(new e56(i56Var, context2, str, str, eVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar2.getParentActivity());
                        String M0 = ob6.M0(2131751499, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131751498, null);
                        alertDialog$Builder.j(ob6.M0(2131751563, null), new b56(this.b, (byte) 0));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        eVar2.showDialog(idVar);
                        return;
                }
            }
        });
        m2.setOnClickListener(new View.OnClickListener(this) {
            public final i56 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        i56 i56Var = this.b;
                        try {
                            if (i56Var.b != null) {
                                Context context2 = i56Var.getContext();
                                String str = i56Var.b;
                                eVar2.showDialog(new e56(i56Var, context2, str, str, eVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar2.getParentActivity());
                        String M0 = ob6.M0(2131751499, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131751498, null);
                        alertDialog$Builder.j(ob6.M0(2131751563, null), new b56(this.b, (byte) 0));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        eVar2.showDialog(idVar);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new cg(this, context, nx0Var, eVar, (byte) 11));
        frameLayout.setOnClickListener(new h6(this, (byte) 8));
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
            imageView.setImageDrawable(imageView.getContext().getDrawable(2131231247));
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
                tL_messages_getChatInviteImporters.peer = uc7.s1(yac.t0).j1(-j);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_messages_getChatInviteImporters, new mw3(this, tL_chatInviteExported, (byte) 15));
            }
        }
    }

    public final void d(int i, ArrayList arrayList, boolean z) {
        this.x = i;
        gb0 gb0Var = this.w;
        if (i == 0) {
            gb0Var.setVisibility(8);
            setPadding(hl.L(19.0f), hl.L(18.0f), hl.L(19.0f), hl.L(18.0f));
        } else {
            gb0Var.setVisibility(0);
            setPadding(hl.L(19.0f), hl.L(18.0f), hl.L(19.0f), hl.L(10.0f));
            ((TextView) gb0Var.b).setText(ob6.G(i, "PeopleJoined", new Object[0]));
            gb0Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                uc7.s1(yac.t0).i4((TLRPC.User) arrayList.get(i2), false, false);
            }
            int min = Math.min(3, Math.min(i, arrayList.size()));
            ((g56) gb0Var.c).setCount(min);
            for (int i3 = 0; i3 < min; i3++) {
                ((g56) gb0Var.c).b(i3, yac.t0, (TLObject) arrayList.get(i3));
            }
        } else {
            ((g56) gb0Var.c).setCount(0);
        }
        ((g56) gb0Var.c).a(z);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        v21 Q = d31.b0(this.c).Q(2131624029, 36, spannableStringBuilder);
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
        gb0 gb0Var = this.w;
        if (z) {
            yob.a0(textView4);
            yob.a0(textView3);
            yob.a0(textView2);
            yob.a0(frameLayout);
            yob.a0(textView);
            yob.a0(imageView);
            yob.a0((TextView) gb0Var.b);
            yob.a0(gb0Var);
            f56 f56Var = this.F;
            if (f56Var != null) {
                f56Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i = aob.Ji;
        yob.X(textView4, i, null);
        yob.X(textView3, i, null);
        yob.X(textView2, i, null);
        int L = hl.L(21.0f);
        int i2 = aob.Fi;
        int w0 = aob.w0(null, i2, false);
        int i3 = aob.Hi;
        int w02 = aob.w0(null, i3, false);
        yob.R(textView4, aob.i0(L, L, L, L, w0, w02, w02), yob.M(i2), yob.M(i3), null);
        int L2 = hl.L(21.0f);
        int w03 = aob.w0(null, i2, false);
        int w04 = aob.w0(null, i3, false);
        yob.R(textView3, aob.i0(L2, L2, L2, L2, w03, w04, w04), yob.M(i2), yob.M(i3), null);
        int L3 = hl.L(21.0f);
        int i4 = aob.ka;
        int w05 = aob.w0(null, i4, false);
        int i5 = aob.d6;
        int o = vm2.o(aob.w0(null, i5, false), 120);
        yob.R(textView2, aob.i0(L3, L3, L3, L3, w05, o, o), yob.M(i4), yob.g(i5, 120), null);
        int L4 = hl.L(21.0f);
        int i6 = aob.e7;
        int w06 = aob.w0(null, i6, false);
        int i7 = aob.i6;
        int o2 = vm2.o(aob.w0(null, i7, false), 76);
        yob.R(frameLayout, aob.i0(L4, L4, L4, L4, w06, o2, o2), yob.M(i6), yob.g(i7, 76), null);
        yob.X(textView, aob.G6, null);
        yob.s(imageView, aob.r5, null, PorterDuff.Mode.SRC_ATOP);
        int i8 = aob.n6;
        yob.X((TextView) gb0Var.b, i8, null);
        int L5 = hl.L(6.0f);
        int o3 = vm2.o(aob.w0(null, i8, false), 76);
        hf0 i0 = aob.i0(L5, L5, L5, L5, 0, o3, o3);
        uob g = yob.g(i8, 76);
        gb0Var.setBackground(i0);
        yob.j(gb0Var, i0, null, g, null);
        f56 f56Var2 = this.F;
        if (f56Var2 != null) {
            f56Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z) {
        this.H = z;
    }

    public void setDelegate(h56 h56Var) {
        this.r = h56Var;
    }

    public void setLink(String str) {
        this.b = str;
        TextView textView = this.a;
        if (str == null) {
            textView.setText(ob6.M0(2131748533, null));
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
