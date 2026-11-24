package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.Switch;
public final class a1 extends mz0 implements jm7 {
    public final b61 A2;
    public final b61 B2;
    public final b61 C2;
    public final FrameLayout D2;
    public boolean E2;
    public String F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public long K2;
    public y8c L2;
    public String M2;
    public p09 N2;
    public l7c O2;
    public boolean P2;
    public h0 Q2;
    public gx1 R2;
    public CharSequence S1;
    public boolean S2;
    public TL_iv.RichMessage T1;
    public i0 T2;
    public boolean U1;
    public int U2;
    public CharSequence V1;
    public boolean V2;
    public TL_iv.RichMessage W1;
    public final TLRPC.TL_messages_composeMessageWithAI[] W2;
    public boolean X1;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] X2;
    public CharSequence Y1;
    public int Y2;
    public TL_iv.RichMessage Z1;
    public boolean a2;
    public CharSequence b2;
    public TL_iv.RichMessage c2;
    public CharSequence d2;
    public qac e2;
    public qac f2;
    public long g2;
    public boolean h2;
    public nac i2;
    public jx1 j2;
    public final boolean[] k2;
    public final boolean[] l2;
    public String m2;
    public String n2;
    public String o2;
    public TL_aicompose.AiComposeTone p2;
    public boolean q2;
    public final id r2;
    public final FrameLayout s2;
    public final z0 t2;
    public final z0 u2;
    public final ImageView v2;
    public final FrameLayout w2;
    public final su3 x2;
    public hg5 y2;
    public final LinearLayout z2;

    public a1(Context context, ylb ylbVar) {
        super(context, null, true, true, 2, ylbVar);
        this.k2 = new boolean[1];
        this.l2 = new boolean[1];
        this.P2 = true;
        this.U2 = -1;
        this.W2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.X2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        id P1 = oc7.r1(this.a).P1();
        this.r2 = P1;
        P1.b();
        P1.d = true;
        ImageView imageView = new ImageView(context);
        this.v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231273);
        int i = cmb.F6;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_ATOP);
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i, this.J0)), 1, -1);
        wmb K = anb.K(0.1f, i);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, K, ylbVar);
        this.o1.addView(imageView, qoe.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        rve.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new d(this, (byte) 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s2 = frameLayout;
        z0 z0Var = new z0(context, this.a, 0, false, ylbVar);
        this.t2 = z0Var;
        z0Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        int L = gm.L(28.0f);
        int i2 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        z0Var.setBackground(b0);
        anb.j(z0Var, b0, M, null, ylbVar);
        z0Var.setRoundRadius(28);
        z0Var.a(2131232493, jb6.M0(2131754962, null), new h(this, (byte) 3));
        z0Var.a(2131231882, jb6.M0(2131754963, null), new h(this, (byte) 3));
        z0Var.a(2131231869, jb6.M0(2131754964, null), new h(this, (byte) 3));
        z0Var.c(1, true);
        frameLayout.addView(z0Var, qoe.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w2 = frameLayout2;
        su3 su3Var = new su3(context, jb6.M0(2131754023, null), true, false, oc7.r1(this.a).l4.V.f(), ylbVar);
        this.x2 = su3Var;
        ru3 ru3Var = su3Var.d;
        ru3Var.setImeOptions(6);
        ru3Var.setMaxLines(5);
        ShapeDrawable b02 = cmb.b0(gm.L(20.0f), cmb.v0(i2, ylbVar));
        wmb M2 = anb.M(i2);
        su3Var.setBackground(b02);
        anb.j(su3Var, b02, M2, null, ylbVar);
        ru3Var.addTextChangedListener(new v(this));
        frameLayout2.addView(su3Var, qoe.c(-2.0f, -1));
        frameLayout2.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
        ru3Var.setPadding(gm.L(11.0f), gm.L(15.0f), gm.L(53.0f), gm.L(15.0f));
        z0 z0Var2 = new z0(context, this.a, 0, true, ylbVar);
        this.u2 = z0Var2;
        z0Var2.setDivider(true);
        z0Var2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        z0Var2.setRoundRadius(12);
        z0Var2.w = new r(this, ylbVar, context, (byte) 0);
        v1();
        z0Var2.c(-1, true);
        String G0 = s1c.G0();
        this.n2 = G0;
        if (G0 == null) {
            this.n2 = b3c.i();
        }
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        this.u1 = 0.35f;
        int i3 = cmb.Z6;
        s0(cmb.v0(i3, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.z2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i3, this.J0)), cmb.v0(i3, this.J0), cmb.v0(i3, this.J0)}));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setRoundRadius(24);
        this.B2 = b61Var;
        b61Var.setScaleLoading(true);
        linearLayout.addView(b61Var, qoe.p(-1, 48, 1.0f, 119));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        this.C2 = i4;
        i4.setOnClickListener(new d(this, (byte) 10));
        i4.setOnLongClickListener(new s(this, ylbVar, context, (byte) 0));
        linearLayout.addView(i4, qoe.t(48, 48, 5, 10, 0, 0, 0));
        b61 i5 = mlb.i(24, ylbVar, context, true);
        this.A2 = i5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131754991, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new s0(), length, spannableStringBuilder.length(), 33);
        i5.setText(spannableStringBuilder);
        i5.setOnClickListener(new t(this, ylbVar, (byte) 0));
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(linearLayout, e);
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(i5, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D2 = frameLayout3;
        FrameLayout.LayoutParams d2 = qoe.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i10 = d2.leftMargin;
        int i11 = this.u0;
        d2.leftMargin = i10 + i11;
        d2.rightMargin += i11;
        this.b.addView(frameLayout3, d2);
        s1(false);
        r59 r59Var = this.n1;
        int i12 = this.u0;
        r59Var.setPadding(i12, 0, i12, gm.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 0));
        this.I1 = true;
        x xVar = new x(this);
        xVar.m = false;
        xVar.C = false;
        xVar.o(d53.h);
        xVar.n(300L);
        this.n1.setItemAnimator(xVar);
        this.n1.setOnScrollListener(new y(this, (byte) 0));
        this.O2.O(false);
        gm.c3(new a(this, (byte) 0));
        nm7.f(this.a).b(this, nm7.b4);
    }

    public static void c1(TL_iv.PageBlock pageBlock, StringBuilder sb) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        d1(richText, sb);
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i = 0; i < pageblocklist.items.size(); i++) {
                        if (i > 0) {
                            sb.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            d1(((TL_iv.TL_pageListItemText) pageListItem).text, sb);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (i2 > 0) {
                                    sb.append("\n");
                                }
                                c1(arrayList.get(i2), sb);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                        if (i3 > 0) {
                            sb.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            d1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    sb.append("\n");
                                }
                                c1(arrayList2.get(i4), sb);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                d1(pageCaption.text, sb);
                return;
            }
            return;
        }
        d1(pageBlock.text, sb);
    }

    public static void d1(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                d1(textconcat.texts.get(i), sb);
            }
        } else if (richText != null) {
            d1(richText.text, sb);
        }
    }

    public static void e1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) zk9.r(richText, null, true));
                        return;
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockList) {
                    TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                    for (int i = 0; i < pageblocklist.items.size(); i++) {
                        if (i > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListItem pageListItem = pageblocklist.items.get(i);
                        if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                            spannableStringBuilder.append((CharSequence) zk9.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (i2 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                e1(arrayList.get(i2), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                    for (int i3 = 0; i3 < pageblockorderedlist.items.size(); i3++) {
                        if (i3 > 0) {
                            spannableStringBuilder.append("\n");
                        }
                        TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i3);
                        if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                            spannableStringBuilder.append((CharSequence) zk9.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                e1(arrayList2.get(i4), spannableStringBuilder);
                            }
                        }
                    }
                    return;
                } else {
                    return;
                }
            }
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption != null) {
                spannableStringBuilder.append((CharSequence) zk9.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) zk9.r(pageBlock.text, pageBlock, true));
    }

    public static void q1(c41 c41Var, int i) {
        int i2;
        String a0;
        if (c41Var.X() == null) {
            return;
        }
        gs gsVar = oc7.r1(i).l4;
        boolean p = z8c.h(i).p();
        if (!p) {
            i2 = 2131624211;
        } else {
            i2 = 2131624012;
        }
        String M0 = jb6.M0(2131754976, null);
        if (!p) {
            a0 = jb6.a0(null, null, 2131754977, Integer.valueOf(gsVar.W.f()), Integer.valueOf(gsVar.X.f()));
        } else {
            a0 = jb6.a0(null, null, 2131754978, Integer.valueOf(gsVar.X.f()));
        }
        c41Var.I(i2, M0, gm.N2(a0, -1, 0, new i(c41Var, (byte) 0), null)).j();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new f(this, (byte) 0), this.J0);
        this.O2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        if (this.M2 == null) {
            this.M2 = jb6.M0(2131755006, null);
            p09 p09Var = new p09(2131624011, gm.L(24.0f), gm.L(24.0f));
            this.N2 = p09Var;
            p09Var.E(true);
            this.N2.F(1);
        }
        return this.M2;
    }

    @Override
    public final void L0(float f) {
        float f2 = 1.0f - f;
        ImageView imageView = this.v2;
        imageView.setAlpha(f2);
        imageView.setScaleX(gm.R1(0.6f, 1.0f, f2));
        imageView.setScaleY(gm.R1(0.6f, 1.0f, f2));
    }

    public final void Y0(bu5 bu5Var, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = cmb.D8;
        int i2 = cmb.E8;
        a8 a8Var = new a8(1, this.J0, getContext(), false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.setText(str);
        a8Var.setChecked(z);
        a8Var.d(cmb.v0(i, this.J0), cmb.v0(i2, this.J0));
        a8Var.setSelectorColor(cmb.p1(0.12f, cmb.v0(i, this.J0)));
        a8Var.setOnClickListener(new q(bu5Var, z, runnable, (byte) 0));
        linearLayout.addView(a8Var, qoe.o(-1, -2));
    }

    public final TLRPC.TL_messages_composeMessageWithAI Z0(int i) {
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        if (i == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = b3c.D(this.n2);
            TL_aicompose.AiComposeTone aiComposeTone = this.p2;
            if (aiComposeTone != null) {
                fromDefault = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            } else {
                fromDefault = TL_aicompose.InputAiComposeTone.fromDefault(null);
            }
            tL_messages_composeMessageWithAI.tone = fromDefault;
            tL_messages_composeMessageWithAI.emojify = this.q2;
            return tL_messages_composeMessageWithAI;
        } else if (i == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
            if (selectedTone instanceof t0) {
                TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                if (TextUtils.isEmpty(this.F2)) {
                    str = "";
                } else {
                    str = this.F2;
                }
                inputaicomposetonesingleuse.custom_prompt = str;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonesingleuse;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                inputaicomposetoneid.id = tL_aiComposeTone.id;
                inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                tL_messages_composeMessageWithAI.tone = inputaicomposetoneid;
            } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                tL_messages_composeMessageWithAI.tone = inputaicomposetonedefault;
            }
            tL_messages_composeMessageWithAI.emojify = this.q2;
            return tL_messages_composeMessageWithAI;
        } else {
            if (i == 2) {
                tL_messages_composeMessageWithAI.proofread = true;
            }
            return tL_messages_composeMessageWithAI;
        }
    }

    public final void a1() {
        if (this.U2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.U2, true);
            this.U2 = -1;
        }
        this.V2 = false;
        lka titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final ed b1() {
        String M0;
        z0 z0Var = this.t2;
        if (z0Var == null) {
            return null;
        }
        int selectedTab = z0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI Z0 = Z0(selectedTab);
        boolean z = Z0.proofread;
        if (!z && Z0.translate_to_lang == null && Z0.tone == null) {
            return null;
        }
        TL_aicompose.InputAiComposeTone inputAiComposeTone = Z0.tone;
        if (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse) {
            return null;
        }
        ?? obj = new Object();
        obj.f = selectedTab;
        obj.a = z;
        obj.b = Z0.emojify;
        obj.c = Z0.translate_to_lang;
        obj.d = inputAiComposeTone;
        if (selectedTab == 0) {
            String E0 = s1c.E0(s1c.J0(this.n2, null, null));
            if (this.o2 != null) {
                E0 = kt6.p(this.o2, " ", E0, new StringBuilder());
            }
            obj.e = E0;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
            if (!(selectedTone instanceof t0) && selectedTone != null && !TextUtils.isEmpty(selectedTone.title)) {
                M0 = selectedTone.title;
            } else {
                M0 = jb6.M0(2131754963, null);
            }
            obj.e = M0;
        } else {
            obj.e = jb6.M0(2131754964, null);
        }
        if (obj.b) {
            obj.e = b10.j(new StringBuilder(), obj.e, " + Emoji");
        }
        return obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.b4) {
            v1();
        }
    }

    @Override
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.b4);
        id idVar = this.r2;
        if (idVar != null) {
            idVar.d = false;
        }
        super.dismiss();
    }

    @Override
    public final void e0() {
        super.e0();
        ValueAnimator valueAnimator = this.P0;
        LinearLayout linearLayout = this.z2;
        if (valueAnimator != null) {
            linearLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            linearLayout.setTranslationY(0.0f);
        }
    }

    public final TL_iv.RichMessage f1() {
        if (!this.V2) {
            int selectedTab = this.t2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.U1) {
                    return this.W1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.a2) {
                    return this.c2;
                }
                return null;
            } else if (this.X1) {
                return null;
            } else {
                TL_iv.RichMessage richMessage = this.Z1;
                if (richMessage == null) {
                    return this.T1;
                }
                return richMessage;
            }
        }
        return null;
    }

    public final CharSequence g1() {
        if (i1()) {
            TL_iv.RichMessage f1 = f1();
            if (f1 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < f1.blocks.size(); i++) {
                    if (i > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    e1(f1.blocks.get(i), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.V2) {
            int selectedTab = this.t2.getSelectedTab();
            if (selectedTab == 0) {
                if (!this.U1) {
                    return this.V1;
                }
                return null;
            } else if (selectedTab == 2) {
                if (!this.a2) {
                    return this.d2;
                }
                return null;
            } else if (this.X1) {
                return null;
            } else {
                CharSequence charSequence = this.Y1;
                if (charSequence == null) {
                    return this.S1;
                }
                return charSequence;
            }
        } else {
            return null;
        }
    }

    public final boolean h1() {
        if (this.Q2 != null && this.i2 != null && !this.h2 && !i1() && this.g2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean i1() {
        if (this.T1 != null) {
            return true;
        }
        return false;
    }

    public final c6c j1(int i, TL_iv.RichMessage richMessage, boolean z) {
        if (richMessage == null) {
            richMessage = this.T1;
        }
        int i2 = li9.b;
        c6c K = c6c.K(li9.class);
        K.H = richMessage;
        K.d = i;
        K.e = z;
        return K;
    }

    public final void k1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        r1();
        boolean i1 = i1();
        iz0 iz0Var = this.o1;
        z0 z0Var = this.t2;
        if (i1) {
            String str2 = "";
            int selectedTab = z0Var.getSelectedTab();
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
            tL_messages_composeRichMessageWithAI.flags |= 16;
            TL_iv.RichMessage richMessage = this.T1;
            TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
            if (richMessage == null) {
                str = null;
            } else {
                tL_inputRichMessage.rtl = richMessage.rtl;
                tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
                for (int i = 0; i < richMessage.blocks.size(); i++) {
                    tL_inputRichMessage.blocks.add(a6a.x0(richMessage.blocks.get(i)));
                }
                ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_inputRichMessage.flags |= 4;
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.Photo photo = arrayList2.get(i2);
                        i2++;
                        TLRPC.Photo photo2 = photo;
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_inputPhoto.id = photo2.id;
                        tL_inputPhoto.access_hash = photo2.access_hash;
                        byte[] bArr = photo2.file_reference;
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        tL_inputPhoto.file_reference = bArr;
                        tL_inputRichMessage.photos.add(tL_inputPhoto);
                    }
                }
                str = null;
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    tL_inputRichMessage.flags |= 8;
                    ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
                    int size2 = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        TLRPC.Document document = arrayList4.get(i3);
                        i3++;
                        TLRPC.Document document2 = document;
                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                        tL_inputDocument.id = document2.id;
                        tL_inputDocument.access_hash = document2.access_hash;
                        byte[] bArr2 = document2.file_reference;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        tL_inputDocument.file_reference = bArr2;
                        tL_inputRichMessage.documents.add(tL_inputDocument);
                    }
                }
            }
            tL_messages_composeRichMessageWithAI.text = tL_inputRichMessage;
            if (selectedTab == 0) {
                tL_messages_composeRichMessageWithAI.translate_to_lang = b3c.D(this.n2);
                TL_aicompose.AiComposeTone aiComposeTone = this.p2;
                if (aiComposeTone != null) {
                    fromDefault = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                } else {
                    fromDefault = TL_aicompose.InputAiComposeTone.fromDefault(str);
                }
                tL_messages_composeRichMessageWithAI.tone = fromDefault;
                tL_messages_composeRichMessageWithAI.emojify = this.q2;
            } else if (selectedTab == 1) {
                TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
                if (selectedTone instanceof t0) {
                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                    if (!TextUtils.isEmpty(this.F2)) {
                        str2 = this.F2;
                    }
                    inputaicomposetonesingleuse.custom_prompt = str2;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeTone) {
                    TL_aicompose.inputAiComposeToneID inputaicomposetoneid = new TL_aicompose.inputAiComposeToneID();
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) selectedTone;
                    inputaicomposetoneid.id = tL_aiComposeTone.id;
                    inputaicomposetoneid.access_hash = tL_aiComposeTone.access_hash;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetoneid;
                } else if (selectedTone instanceof TL_aicompose.TL_aiComposeToneDefault) {
                    TL_aicompose.inputAiComposeToneDefault inputaicomposetonedefault = new TL_aicompose.inputAiComposeToneDefault();
                    inputaicomposetonedefault.tone = ((TL_aicompose.TL_aiComposeToneDefault) selectedTone).tone;
                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonedefault;
                }
                tL_messages_composeRichMessageWithAI.emojify = this.q2;
            } else if (selectedTab == 2) {
                tL_messages_composeRichMessageWithAI.proofread = true;
            }
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.X2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.V2 = true;
                    this.G2 = false;
                    s1(true);
                    lka titleTextView = iz0Var.getTitleTextView();
                    titleTextView.i(this.N2);
                    this.N2.start();
                    if (selectedTab == 0) {
                        this.U1 = true;
                    } else if (selectedTab == 1) {
                        this.X1 = true;
                    } else if (selectedTab == 2) {
                        this.a2 = true;
                    }
                    this.U2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new kc((byte) 0), new e(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, (byte) 1));
                    this.O2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        String str3 = "";
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = hs6.d0(this.a).Y(charSequenceArr, true, true);
        CharSequence charSequence5 = charSequenceArr[0];
        if (charSequence5 != null) {
            str3 = charSequence5.toString();
        }
        tL_textWithEntities.text = str3;
        int selectedTab2 = z0Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI Z0 = Z0(selectedTab2);
        Z0.text = tL_textWithEntities;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = this.W2[selectedTab2];
        if (tL_messages_composeMessageWithAI == null || tL_messages_composeMessageWithAI.proofread != Z0.proofread || tL_messages_composeMessageWithAI.emojify != Z0.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI.tone, Z0.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI.translate_to_lang, Z0.translate_to_lang)) {
            if (!Z0.emojify && !Z0.proofread && Z0.tone == null && Z0.translate_to_lang == null) {
                return;
            }
            this.V2 = true;
            this.G2 = false;
            s1(true);
            lka titleTextView2 = iz0Var.getTitleTextView();
            titleTextView2.i(this.N2);
            this.N2.start();
            int selectedTab3 = z0Var.getSelectedTab();
            CharSequence charSequence6 = this.S1;
            if (selectedTab3 == 0 && (charSequence4 = this.V1) != null) {
                charSequence6 = charSequence4;
            }
            if (selectedTab3 == 1 && (charSequence3 = this.Y1) != null) {
                charSequence6 = charSequence3;
            }
            if (selectedTab3 == 2 && (charSequence2 = this.b2) != null) {
                charSequence = charSequence2;
            } else {
                charSequence = charSequence6;
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gm.L(16.0f));
            int L = gm.q.x - gm.L(64.0f);
            int i4 = this.u0;
            int b = pqe.b(new StaticLayout(charSequence, textPaint, (L - i4) - i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < b; i5++) {
                if (i5 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = gm.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) jb6.M0(2131748536, null));
                ta6 ta6Var = new ta6(null, L2, 0, null);
                ta6Var.f = gm.L(6.0f);
                ta6Var.h = 0.5f;
                ta6Var.n = true;
                spannableStringBuilder.setSpan(ta6Var, length, spannableStringBuilder.length(), 33);
            }
            if (selectedTab2 == 0) {
                this.U1 = true;
                this.V1 = spannableStringBuilder;
            } else if (selectedTab2 == 1) {
                this.X1 = true;
                this.Y1 = spannableStringBuilder;
            } else if (selectedTab2 == 2) {
                this.a2 = true;
                this.b2 = spannableStringBuilder;
            }
            this.U2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(Z0, new kc((byte) 0), new e(this, titleTextView2, selectedTab2, Z0, (byte) 0));
            this.O2.O(true);
        }
    }

    public final void l1(int i, int i2, boolean z) {
        if (this.j2 != null) {
            TL_iv.RichMessage f1 = f1();
            if (f1 != null) {
                this.j2.a(f1, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        } else if (this.i2 != null && g1() != null) {
            this.i2.a(g1(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    public final void m1(long j, boolean z, nac nacVar) {
        this.g2 = j;
        this.h2 = z;
        this.i2 = nacVar;
        if (this.Q2 != null) {
            return;
        }
        ?? bjbVar = new bjb(21, this.J0, getContext(), false);
        this.Q2 = bjbVar;
        Switch checkBox = bjbVar.getCheckBox();
        int i = cmb.L6;
        int i2 = cmb.Ei;
        int i3 = cmb.c6;
        checkBox.d(i, i2, i3, i3);
        this.Q2.setBackground(cmb.f0(cmb.v0(cmb.i6, this.J0), 2, -1));
        this.Q2.setOnClickListener(new d(this, (byte) 4));
    }

    public final void n1(TL_iv.RichMessage richMessage) {
        this.T1 = richMessage;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < richMessage.blocks.size(); i++) {
            if (i > 0) {
                sb.append("\n");
            }
            c1(richMessage.blocks.get(i), sb);
        }
        eoe.b(sb.toString(), new b(this, (byte) 1), new c((byte) 1), false);
        v1();
    }

    public final void o1(CharSequence charSequence) {
        String str;
        Object[] spans;
        if (!(charSequence instanceof Spanned)) {
            str = charSequence.toString();
        } else {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {xkb.class, bl2.class, boa.class, j6c.class, i6c.class, f6c.class, g6c.class, jo4.class, e6c.class, d6c.class, gn.class};
            for (int i = 0; i < 11; i++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        }
        this.S1 = str;
        eoe.b(charSequence.toString(), new b(this, (byte) 0), new c((byte) 0), false);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.Y2) {
                this.Y2 = v0;
                s0(v0);
                this.z2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p1(TL_aicompose.AiComposeTone aiComposeTone) {
        String str;
        this.p2 = aiComposeTone;
        if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
            str = aiComposeTone.title;
        } else {
            str = null;
        }
        this.o2 = str;
        a1();
        k1();
        this.O2.O(true);
    }

    public final void r1() {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        boolean z2;
        float f;
        if (!h1()) {
            return;
        }
        ed b = fd.b(this.a, this.g2);
        ed b1 = b1();
        if (b != null && b1 != null && (b.f != b1.f || b.a != b1.a || b.b != b1.b || !TextUtils.equals(b.c, b1.c) || !TL_aicompose.InputAiComposeTone.equals(fd.d(b.d), fd.d(b1.d)) || !TextUtils.equals(b.e, b1.e))) {
            fd.e(this.a, this.g2, b1);
            gx1 gx1Var = this.R2;
            if (gx1Var != null) {
                gx1Var.run();
            }
            b = b1;
        }
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b1 = b;
        }
        h0 h0Var = this.Q2;
        if (!h0Var.L) {
            h0Var.L = true;
            h0Var.g("Always use in this chat", "", false, false, false);
        }
        if (b1 != null) {
            if (this.T2 == null) {
                this.T2 = new i0();
            }
            spannableStringBuilder = new SpannableStringBuilder("→");
            spannableStringBuilder.setSpan(this.T2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) b1.e);
        } else {
            spannableStringBuilder = null;
        }
        h0 h0Var2 = this.Q2;
        if (h0Var2.isLaidOut() && this.Q2.isAttachedToWindow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (spannableStringBuilder != null) {
            h0Var2.getValueTextView().setText(spannableStringBuilder);
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (h0Var2.N != f || (h0Var2.O == null && h0Var2.M != f)) {
            h0Var2.N = f;
            ValueAnimator valueAnimator = h0Var2.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                h0Var2.O.cancel();
                h0Var2.O = null;
            }
            if (!z2) {
                h0Var2.M = f;
                h0Var2.requestLayout();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(h0Var2.M, f);
                h0Var2.O = ofFloat;
                ofFloat.addUpdateListener(new f0(h0Var2, (byte) 0));
                h0Var2.O.addListener(new g0(h0Var2, (byte) 0));
                h0Var2.O.setDuration(240L);
                h0Var2.O.setInterpolator(d53.h);
                h0Var2.O.start();
            }
        }
        this.Q2.setChecked(z);
    }

    public final void s1(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        long max;
        boolean z2 = this.G2;
        int i3 = 0;
        b61 b61Var = this.B2;
        if (z2) {
            b61Var.setText(jb6.M0(2131747564, null));
            b61Var.setOnClickListener(new d(this, (byte) 0));
        } else {
            z0 z0Var = this.t2;
            if (z0Var != null) {
                i = z0Var.getSelectedTab();
            } else {
                i = 0;
            }
            if (i == 1 && (this.u2.getSelectedTone() instanceof t0) && !TextUtils.equals(this.x2.getText().toString(), this.F2)) {
                b61Var.setText(jb6.M0(2131754024, null));
                b61Var.setOnClickListener(new d(this, (byte) 1));
            } else if (this.f2 == null && this.e2 == null) {
                b61Var.setText(jb6.M0(2131747564, null));
                b61Var.setOnClickListener(new d(this, (byte) 3));
            } else {
                b61Var.setText(jb6.M0(2131755002, null));
                b61Var.setOnClickListener(new d(this, (byte) 2));
            }
        }
        boolean z3 = this.V2;
        y8c y8cVar = this.L2;
        if (y8cVar != null) {
            gm.r(y8cVar);
            this.L2 = null;
        }
        if (z3 != this.J2) {
            if (z3) {
                max = 150;
            } else {
                max = Math.max(0L, 300 - (SystemClock.uptimeMillis() - this.K2));
            }
            y8c y8cVar2 = new y8c((byte) 1, this, z3);
            this.L2 = y8cVar2;
            if (max <= 0) {
                y8cVar2.run();
            } else {
                gm.d3(y8cVar2, max);
            }
        }
        if (z && this.I2 == this.H2) {
            return;
        }
        boolean z4 = this.H2;
        this.I2 = z4;
        b61 b61Var2 = this.A2;
        float f3 = 0.0f;
        LinearLayout linearLayout = this.z2;
        if (z) {
            b61Var2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = b61Var2.animate();
            if (this.H2) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f2);
            d53 d53Var = d53.h;
            alpha.setInterpolator(d53Var).setDuration(320L).withEndAction(new a(this, (byte) 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.H2) {
                f3 = 1.0f;
            }
            animate2.alpha(f3).setInterpolator(d53Var).setDuration(320L).withEndAction(new a(this, (byte) 2)).start();
            return;
        }
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        b61Var2.setVisibility(i2);
        if (this.H2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        b61Var2.setAlpha(f);
        if (this.H2) {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
        if (!this.H2) {
            f3 = 1.0f;
        }
        linearLayout.setAlpha(f3);
    }

    @Override
    public final void show() {
        int i;
        int i2;
        String str;
        z0 z0Var;
        super.show();
        iz0 iz0Var = this.o1;
        if (iz0Var != null) {
            iz0Var.setTitle(J0());
        }
        if (!this.h2 && (this.j2 != null || this.i2 != null)) {
            i = 0;
        } else {
            i = 8;
        }
        b61 b61Var = this.C2;
        b61Var.setVisibility(i);
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131745374, null));
        if (this.h2) {
            i2 = 2131231155;
        } else {
            i2 = 2131232711;
        }
        pn2 pn2Var = new pn2(i2, 0);
        pn2Var.s = gm.L(1.0f);
        spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 33);
        b61Var.setText(spannableStringBuilder);
        if (!this.S2 && h1()) {
            this.S2 = true;
            ed b = fd.b(this.a, this.g2);
            if (b != null) {
                int i3 = b.f;
                z0 z0Var2 = this.t2;
                if (i3 == 1) {
                    TL_aicompose.AiComposeTone a = fd.a(this.a, b.d);
                    if (a != null && (z0Var = this.u2) != null) {
                        this.q2 = b.b;
                        z0Var2.c(1, false);
                        z0Var.d(a, false);
                    }
                } else if (i3 == 0 && (str = b.c) != null) {
                    this.q2 = b.b;
                    this.n2 = str;
                    TL_aicompose.AiComposeTone a2 = fd.a(this.a, b.d);
                    this.p2 = a2;
                    if (a2 != null && !TextUtils.isEmpty(a2.title)) {
                        str2 = this.p2.title;
                    }
                    this.o2 = str2;
                    z0Var2.c(0, false);
                } else if (i3 == 2) {
                    z0Var2.c(2, false);
                }
            }
        }
        this.O2.O(false);
        k1();
        s1(true);
    }

    public final void t1() {
        float f;
        String str = this.F2;
        su3 su3Var = this.x2;
        boolean equals = TextUtils.equals(str, su3Var.d.getText().toString());
        boolean z = !equals;
        if (this.E2 == z) {
            return;
        }
        ViewPropertyAnimator animate = su3Var.d.animate();
        this.E2 = z;
        if (!equals) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        wi8.s(animate, f, 320L);
        this.O2.O(true);
    }

    public final void u1() {
        r59 r59Var;
        View view;
        if (this.y2 == null) {
            return;
        }
        int i = 0;
        while (true) {
            r59Var = this.n1;
            if (i < r59Var.getChildCount()) {
                view = r59Var.getChildAt(i);
                c6c G = this.O2.G(RecyclerView.R(view) - 1);
                if (G != null && G.c == this.u2) {
                    break;
                }
                i++;
            } else {
                view = null;
                break;
            }
        }
        hg5 hg5Var = this.y2;
        if (view != null) {
            hg5Var.setVisibility(0);
            this.y2.setTranslationY(view.getY() + r59Var.getY() + view.getHeight());
            return;
        }
        hg5Var.setVisibility(4);
        this.y2.f(true);
    }

    public final void v1() {
        z0 z0Var = this.u2;
        TL_aicompose.AiComposeTone selectedTone = z0Var.getSelectedTone();
        z0Var.c.removeAllViews();
        if (i1()) {
            z0Var.b(new TL_aicompose.AiComposeTone(), new h(this, (byte) 0));
        }
        z0Var.b(null, new h(this, (byte) 0));
        ArrayList arrayList = this.r2.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z0Var.b((TL_aicompose.AiComposeTone) obj, new h(this, (byte) 0));
        }
        if (selectedTone != z0Var.getSelectedTone()) {
            z0Var.d(null, true);
        }
    }
}
