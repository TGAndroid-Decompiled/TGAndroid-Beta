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
public class f36 extends LinearLayout {
    public boolean E;
    public c36 F;
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
    public e36 r;
    public m8 s;
    public final eb0 w;
    public int x;
    public boolean y;

    public f36(Context context, final d dVar, fx0 fx0Var, boolean z, boolean z2) {
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
        textView.setPadding(gl.L(18.0f), gl.L(13.0f), gl.L(40.0f), gl.L(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(2131231247));
        imageView.setContentDescription(k96.M0(2131754838, null));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, nme.e(40, 48, 21));
        addView(frameLayout, nme.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        ote.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new cm2(0, context.getDrawable(2131232109)), 0, 1, 0);
        spannableStringBuilder.setSpan(new se3(gl.L(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) k96.M0(2131748734, null));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(k96.M0(2131748734, null));
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setSingleLine(true);
        TextView m = ug8.m(linearLayout, textView2, nme.q(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f = m;
        ote.b(m, 0.025f, 1.2f);
        m.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new cm2(0, context.getDrawable(2131232369)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new se3(gl.L(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131748733, null));
        m.setText(spannableStringBuilder2);
        m.setContentDescription(k96.M0(2131748733, null));
        m.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        m.setTextSize(1, 14.0f);
        m.setTypeface(gl.o());
        m.setSingleLine(true);
        TextView m2 = ug8.m(linearLayout, m, nme.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = m2;
        ote.b(m2, 0.025f, 1.2f);
        m2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new cm2(0, context.getDrawable(2131232115)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new se3(gl.L(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) k96.M0(2131751522, null));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new se3(gl.L(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        m2.setText(spannableStringBuilder3);
        m2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        m2.setTextSize(1, 14.0f);
        m2.setTypeface(gl.o());
        m2.setSingleLine(true);
        linearLayout.addView(m2, nme.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        m2.setVisibility(8);
        addView(linearLayout, nme.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        eb0 eb0Var = new eb0(this, context);
        this.w = eb0Var;
        ((d36) eb0Var.c).setAvatarsTextSize(gl.L(18.0f));
        addView(eb0Var, nme.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new hu4(this, fx0Var, dVar, (byte) 5));
        if (z) {
            eb0Var.setOnClickListener(new z26(this, (byte) 0));
        }
        m.setOnClickListener(new View.OnClickListener(this) {
            public final f36 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        f36 f36Var = this.b;
                        try {
                            if (f36Var.b != null) {
                                Context context2 = f36Var.getContext();
                                String str = f36Var.b;
                                dVar2.showDialog(new b36(f36Var, context2, str, str, dVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                        String M0 = k96.M0(2131751522, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131751521, null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new y26(this.b, (byte) 0));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        dVar2.showDialog(hdVar);
                        return;
                }
            }
        });
        m2.setOnClickListener(new View.OnClickListener(this) {
            public final f36 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        f36 f36Var = this.b;
                        try {
                            if (f36Var.b != null) {
                                Context context2 = f36Var.getContext();
                                String str = f36Var.b;
                                dVar2.showDialog(new b36(f36Var, context2, str, str, dVar2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    default:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar2.getParentActivity());
                        String M0 = k96.M0(2131751522, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131751521, null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new y26(this.b, (byte) 0));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        dVar2.showDialog(hdVar);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new ee(this, context, fx0Var, dVar, (byte) 11));
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
                tL_messages_getChatInviteImporters.peer = na7.q1(y6c.t0).h1(-j);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.E = true;
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_messages_getChatInviteImporters, new rv3(this, tL_chatInviteExported, (byte) 15));
            }
        }
    }

    public final void d(int i, ArrayList arrayList, boolean z) {
        this.x = i;
        eb0 eb0Var = this.w;
        if (i == 0) {
            eb0Var.setVisibility(8);
            setPadding(gl.L(19.0f), gl.L(18.0f), gl.L(19.0f), gl.L(18.0f));
        } else {
            eb0Var.setVisibility(0);
            setPadding(gl.L(19.0f), gl.L(18.0f), gl.L(19.0f), gl.L(10.0f));
            ((TextView) eb0Var.b).setText(k96.G(i, "PeopleJoined", new Object[0]));
            eb0Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                na7.q1(y6c.t0).a4((TLRPC.User) arrayList.get(i2), false, false);
            }
            int min = Math.min(3, Math.min(i, arrayList.size()));
            ((d36) eb0Var.c).setCount(min);
            for (int i3 = 0; i3 < min; i3++) {
                ((d36) eb0Var.c).b(i3, y6c.t0, (TLObject) arrayList.get(i3));
            }
        } else {
            ((d36) eb0Var.c).setCount(0);
        }
        ((d36) eb0Var.c).a(z);
    }

    public void e(SpannableStringBuilder spannableStringBuilder) {
        m21 Q = u21.b0(this.c).Q(2131624029, 36, spannableStringBuilder);
        Q.r = false;
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
        eb0 eb0Var = this.w;
        if (z) {
            zkb.a0(textView4);
            zkb.a0(textView3);
            zkb.a0(textView2);
            zkb.a0(frameLayout);
            zkb.a0(textView);
            zkb.a0(imageView);
            zkb.a0((TextView) eb0Var.b);
            zkb.a0(eb0Var);
            c36 c36Var = this.F;
            if (c36Var != null) {
                c36Var.updateColors();
                return;
            }
            return;
        }
        this.L = true;
        int i = bkb.Ii;
        zkb.X(textView4, i, null);
        zkb.X(textView3, i, null);
        zkb.X(textView2, i, null);
        int L = gl.L(21.0f);
        int i2 = bkb.Ei;
        int w0 = bkb.w0(null, i2, false);
        int i3 = bkb.Gi;
        int w02 = bkb.w0(null, i3, false);
        zkb.R(textView4, bkb.i0(L, L, L, L, w0, w02, w02), zkb.M(i2), zkb.M(i3), null);
        int L2 = gl.L(21.0f);
        int w03 = bkb.w0(null, i2, false);
        int w04 = bkb.w0(null, i3, false);
        zkb.R(textView3, bkb.i0(L2, L2, L2, L2, w03, w04, w04), zkb.M(i2), zkb.M(i3), null);
        int L3 = gl.L(21.0f);
        int i4 = bkb.ja;
        int w05 = bkb.w0(null, i4, false);
        int i5 = bkb.c6;
        int o = bm2.o(bkb.w0(null, i5, false), 120);
        zkb.R(textView2, bkb.i0(L3, L3, L3, L3, w05, o, o), zkb.M(i4), zkb.g(i5, 120), null);
        int L4 = gl.L(21.0f);
        int i6 = bkb.d7;
        int w06 = bkb.w0(null, i6, false);
        int i7 = bkb.h6;
        int o2 = bm2.o(bkb.w0(null, i7, false), 76);
        zkb.R(frameLayout, bkb.i0(L4, L4, L4, L4, w06, o2, o2), zkb.M(i6), zkb.g(i7, 76), null);
        zkb.X(textView, bkb.F6, null);
        zkb.s(imageView, bkb.q5, null, PorterDuff.Mode.SRC_ATOP);
        int i8 = bkb.m6;
        zkb.X((TextView) eb0Var.b, i8, null);
        int L5 = gl.L(6.0f);
        int o3 = bm2.o(bkb.w0(null, i8, false), 76);
        ff0 i0 = bkb.i0(L5, L5, L5, L5, 0, o3, o3);
        vkb g = zkb.g(i8, 76);
        eb0Var.setBackground(i0);
        zkb.j(eb0Var, i0, null, g, null);
        c36 c36Var2 = this.F;
        if (c36Var2 != null) {
            c36Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z) {
        this.H = z;
    }

    public void setDelegate(e36 e36Var) {
        this.r = e36Var;
    }

    public void setLink(String str) {
        this.b = str;
        TextView textView = this.a;
        if (str == null) {
            textView.setText(k96.M0(2131748587, null));
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
