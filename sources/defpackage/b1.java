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
public final class b1 extends ny0 implements fn7 {
    public final c51 A2;
    public final c51 B2;
    public final c51 C2;
    public final FrameLayout D2;
    public boolean E2;
    public String F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public long K2;
    public xac L2;
    public final int[] M2;
    public final int[] N2;
    public String O2;
    public b29 P2;
    public l9c Q2;
    public boolean R2;
    public CharSequence S1;
    public i0 S2;
    public TL_iv.RichMessage T1;
    public fw1 T2;
    public boolean U1;
    public boolean U2;
    public CharSequence V1;
    public j0 V2;
    public TL_iv.RichMessage W1;
    public int W2;
    public boolean X1;
    public boolean X2;
    public CharSequence Y1;
    public final TLRPC.TL_messages_composeMessageWithAI[] Y2;
    public TL_iv.RichMessage Z1;
    public final TLRPC.TL_messages_composeRichMessageWithAI[] Z2;
    public boolean a2;
    public int a3;
    public CharSequence b2;
    public TL_iv.RichMessage c2;
    public CharSequence d2;
    public pcc e2;
    public pcc f2;
    public long g2;
    public boolean h2;
    public mcc i2;
    public kw1 j2;
    public final boolean[] k2;
    public final boolean[] l2;
    public String m2;
    public String n2;
    public String o2;
    public TL_aicompose.AiComposeTone p2;
    public boolean q2;
    public final jc r2;
    public final FrameLayout s2;
    public final a1 t2;
    public final a1 u2;
    public final ImageView v2;
    public final FrameLayout w2;
    public final zt3 x2;
    public kg5 y2;
    public final LinearLayout z2;

    public b1(Context context, vnb vnbVar) {
        super(context, null, true, true, 2, vnbVar);
        this.k2 = new boolean[1];
        this.l2 = new boolean[1];
        this.M2 = new int[2];
        this.N2 = new int[2];
        this.R2 = true;
        this.W2 = -1;
        this.Y2 = new TLRPC.TL_messages_composeMessageWithAI[3];
        this.Z2 = new TLRPC.TL_messages_composeRichMessageWithAI[3];
        jc Q1 = uc7.s1(this.a).Q1();
        this.r2 = Q1;
        Q1.b();
        Q1.d = true;
        ImageView imageView = new ImageView(context);
        this.v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        int i = aob.G6;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        hf0 f0 = aob.f0(aob.p1(0.1f, aob.v0(i, this.J0)), 1, -1);
        uob K = yob.K(0.1f, i);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, K, vnbVar);
        this.o1.addView(imageView, tre.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        iye.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b(this, (byte) 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s2 = frameLayout;
        a1 a1Var = new a1(context, this.a, 0, false, vnbVar);
        this.t2 = a1Var;
        a1Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        int L = hl.L(28.0f);
        int i2 = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        a1Var.setBackground(b0);
        yob.j(a1Var, b0, M, null, vnbVar);
        a1Var.setRoundRadius(28);
        a1Var.a(2131232492, ob6.M0(2131754959, null), new h(this, (byte) 3));
        a1Var.a(2131231881, ob6.M0(2131754960, null), new h(this, (byte) 3));
        a1Var.a(2131231868, ob6.M0(2131754961, null), new h(this, (byte) 3));
        a1Var.c(1, true);
        frameLayout.addView(a1Var, tre.d(-1, -1.0f, 119, 12.0f, 0.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w2 = frameLayout2;
        zt3 zt3Var = new zt3(context, ob6.M0(2131754051, null), true, false, uc7.s1(this.a).l4.c0.f(), vnbVar);
        this.x2 = zt3Var;
        yt3 yt3Var = zt3Var.d;
        yt3Var.setImeOptions(6);
        yt3Var.setMaxLines(5);
        ShapeDrawable b02 = aob.b0(hl.L(20.0f), aob.v0(i2, vnbVar));
        uob M2 = yob.M(i2);
        zt3Var.setBackground(b02);
        yob.j(zt3Var, b02, M2, null, vnbVar);
        yt3Var.addTextChangedListener(new v(this));
        frameLayout2.addView(zt3Var, tre.c(-2.0f, -1));
        frameLayout2.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
        yt3Var.setPadding(hl.L(11.0f), hl.L(15.0f), hl.L(53.0f), hl.L(15.0f));
        a1 a1Var2 = new a1(context, this.a, 0, true, vnbVar);
        this.u2 = a1Var2;
        a1Var2.setDivider(true);
        a1Var2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        a1Var2.setRoundRadius(12);
        a1Var2.w = new r(this, vnbVar, context, (byte) 0);
        w1();
        a1Var2.c(-1, true);
        String H0 = r3c.H0();
        this.n2 = H0;
        if (H0 == null) {
            this.n2 = a5c.i();
        }
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        this.u1 = 0.35f;
        int i3 = aob.a7;
        s0(aob.v0(i3, this.J0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.z2 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(12.0f));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, aob.v0(i3, this.J0)), aob.v0(i3, this.J0), aob.v0(i3, this.J0)}));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.setRoundRadius(24);
        this.B2 = c51Var;
        c51Var.setScaleLoading(true);
        linearLayout.addView(c51Var, tre.p(-1, 48, 1.0f, 119));
        c51 i4 = xnb.i(24, vnbVar, context, true);
        this.C2 = i4;
        i4.setOnClickListener(new b(this, (byte) 10));
        i4.setOnLongClickListener(new s(this, vnbVar, context, (byte) 0));
        linearLayout.addView(i4, tre.t(48, 48, 5, 10, 0, 0, 0));
        c51 i5 = xnb.i(24, vnbVar, context, true);
        this.A2 = i5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131754988, null));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "x50");
        spannableStringBuilder.setSpan(new t0(), length, spannableStringBuilder.length(), 33);
        i5.setText(spannableStringBuilder);
        i5.setOnClickListener(new t(this, vnbVar, (byte) 0));
        FrameLayout.LayoutParams e = tre.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(linearLayout, e);
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 80, 12.0f, 6.0f, 12.0f, 12.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(i5, d);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D2 = frameLayout3;
        FrameLayout.LayoutParams d2 = tre.d(-1, 200.0f, 80, 0.0f, 0.0f, 0.0f, 60.0f);
        int i10 = d2.leftMargin;
        int i11 = this.u0;
        d2.leftMargin = i10 + i11;
        d2.rightMargin += i11;
        this.b.addView(frameLayout3, d2);
        u1(false);
        d79 d79Var = this.n1;
        int i12 = this.u0;
        d79Var.setPadding(i12, 0, i12, hl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.s1();
        this.n1.setOnItemClickListener(new u(this, (byte) 0));
        this.I1 = true;
        x xVar = new x(this);
        xVar.m = false;
        xVar.C = false;
        xVar.o(k43.h);
        xVar.n(300L);
        this.n1.setItemAnimator(xVar);
        this.n1.setOnScrollListener(new y(this, (byte) 0));
        this.Q2.O(false);
        hl.c3(new a(this, (byte) 0));
        jn7.f(this.a).b(this, jn7.b4);
    }

    public static void d1(TL_iv.PageBlock pageBlock, StringBuilder sb) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        e1(richText, sb);
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
                            e1(((TL_iv.TL_pageListItemText) pageListItem).text, sb);
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (i2 > 0) {
                                    sb.append("\n");
                                }
                                d1(arrayList.get(i2), sb);
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
                            e1(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, sb);
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    sb.append("\n");
                                }
                                d1(arrayList2.get(i4), sb);
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
                e1(pageCaption.text, sb);
                return;
            }
            return;
        }
        e1(pageBlock.text, sb);
    }

    public static void e1(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                e1(textconcat.texts.get(i), sb);
            }
        } else if (richText != null) {
            e1(richText.text, sb);
        }
    }

    public static void f1(TL_iv.PageBlock pageBlock, SpannableStringBuilder spannableStringBuilder) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
            if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockCollage)) {
                if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
                    if (richText != null) {
                        spannableStringBuilder.append((CharSequence) mm9.r(richText, null, true));
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
                            spannableStringBuilder.append((CharSequence) mm9.r(((TL_iv.TL_pageListItemText) pageListItem).text, null, true));
                        } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList = ((TL_iv.TL_pageListItemBlocks) pageListItem).blocks;
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (i2 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                f1(arrayList.get(i2), spannableStringBuilder);
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
                            spannableStringBuilder.append((CharSequence) mm9.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem).text, null, true));
                        } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            ArrayList<TL_iv.PageBlock> arrayList2 = ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem).blocks;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (i4 > 0) {
                                    spannableStringBuilder.append("\n");
                                }
                                f1(arrayList2.get(i4), spannableStringBuilder);
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
                spannableStringBuilder.append((CharSequence) mm9.r(pageCaption.text, null, true));
                return;
            }
            return;
        }
        spannableStringBuilder.append((CharSequence) mm9.r(pageBlock.text, pageBlock, true));
    }

    public static void s1(d31 d31Var, int i) {
        int i2;
        String a0;
        if (d31Var.X() == null) {
            return;
        }
        hr hrVar = uc7.s1(i).l4;
        boolean p = yac.h(i).p();
        if (!p) {
            i2 = 2131624211;
        } else {
            i2 = 2131624012;
        }
        String M0 = ob6.M0(2131754973, null);
        if (!p) {
            a0 = ob6.a0(null, null, 2131754974, Integer.valueOf(hrVar.d0.f()), Integer.valueOf(hrVar.e0.f()));
        } else {
            a0 = ob6.a0(null, null, 2131754975, Integer.valueOf(hrVar.e0.f()));
        }
        d31Var.I(i2, M0, hl.N2(a0, -1, 0, new i(d31Var, (byte) 0), null)).j();
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new c(this, (byte) 0), this.J0);
        this.Q2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        if (this.O2 == null) {
            this.O2 = ob6.M0(2131755003, null);
            b29 b29Var = new b29(2131624011, hl.L(24.0f), hl.L(24.0f));
            this.P2 = b29Var;
            b29Var.E(true);
            this.P2.F(1);
        }
        return this.O2;
    }

    @Override
    public final void M0(float f) {
        float f2 = 1.0f - f;
        ImageView imageView = this.v2;
        imageView.setAlpha(f2);
        imageView.setScaleX(hl.R1(0.6f, 1.0f, f2));
        imageView.setScaleY(hl.R1(0.6f, 1.0f, f2));
    }

    public final void Z0(fu5 fu5Var, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = aob.E8;
        int i2 = aob.F8;
        b8 b8Var = new b8(1, this.J0, getContext(), false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.setText(str);
        b8Var.setChecked(z);
        b8Var.d(aob.v0(i, this.J0), aob.v0(i2, this.J0));
        b8Var.setSelectorColor(aob.p1(0.12f, aob.v0(i, this.J0)));
        b8Var.setOnClickListener(new q(fu5Var, z, runnable, (byte) 0));
        linearLayout.addView(b8Var, tre.o(-1, -2));
    }

    public final TLRPC.TL_messages_composeMessageWithAI a1(int i) {
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        if (i == 0) {
            tL_messages_composeMessageWithAI.translate_to_lang = a5c.D(this.n2);
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
            if (selectedTone instanceof u0) {
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

    public final void b1() {
        if (this.W2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.W2, true);
            this.W2 = -1;
        }
        this.X2 = false;
        ema titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.i(null);
        }
    }

    public final ec c1() {
        String M0;
        a1 a1Var = this.t2;
        if (a1Var == null) {
            return null;
        }
        int selectedTab = a1Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI a1 = a1(selectedTab);
        boolean z = a1.proofread;
        if (!z && a1.translate_to_lang == null && a1.tone == null) {
            return null;
        }
        TL_aicompose.InputAiComposeTone inputAiComposeTone = a1.tone;
        if (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse) {
            return null;
        }
        ?? obj = new Object();
        obj.f = selectedTab;
        obj.a = z;
        obj.b = a1.emojify;
        obj.c = a1.translate_to_lang;
        obj.d = inputAiComposeTone;
        if (selectedTab == 0) {
            String F0 = r3c.F0(r3c.K0(this.n2, null, null));
            if (this.o2 != null) {
                F0 = qu6.o(this.o2, " ", F0, new StringBuilder());
            }
            obj.e = F0;
        } else if (selectedTab == 1) {
            TL_aicompose.AiComposeTone selectedTone = this.u2.getSelectedTone();
            if (!(selectedTone instanceof u0) && selectedTone != null && !TextUtils.isEmpty(selectedTone.title)) {
                M0 = selectedTone.title;
            } else {
                M0 = ob6.M0(2131754960, null);
            }
            obj.e = M0;
        } else {
            obj.e = ob6.M0(2131754961, null);
        }
        if (obj.b) {
            obj.e = c00.k(new StringBuilder(), obj.e, " + Emoji");
        }
        return obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.b4) {
            w1();
        }
    }

    @Override
    public final void dismiss() {
        jn7.f(this.a).n(this, jn7.b4);
        jc jcVar = this.r2;
        if (jcVar != null) {
            jcVar.d = false;
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

    public final TL_iv.RichMessage g1() {
        if (!this.X2) {
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

    public final CharSequence h1() {
        if (j1()) {
            TL_iv.RichMessage g1 = g1();
            if (g1 != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < g1.blocks.size(); i++) {
                    if (i > 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    f1(g1.blocks.get(i), spannableStringBuilder);
                }
                return spannableStringBuilder;
            }
            return null;
        } else if (!this.X2) {
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

    public final boolean i1() {
        if (this.S2 != null && this.i2 != null && !this.h2 && !j1() && this.g2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean j1() {
        if (this.T1 != null) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z) {
        View view;
        int[] iArr;
        int[] iArr2;
        if (this.y2 != null) {
            int i = 0;
            while (true) {
                d79 d79Var = this.n1;
                if (i < d79Var.getChildCount()) {
                    view = d79Var.getChildAt(i);
                    b8c G = this.Q2.G(RecyclerView.S(view) - 1);
                    if (G != null && G.c == this.u2) {
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
            kg5 kg5Var = this.y2;
            if (view != null) {
                kg5Var.setVisibility(0);
                view.getLocationInWindow(this.M2);
                ((View) this.y2.getParent()).getLocationInWindow(this.N2);
                float scaleY = (view.getScaleY() * view.getHeight()) + (iArr[1] - iArr2[1]);
                if (Math.abs(this.y2.getTranslationY() - scaleY) > 0.5f) {
                    this.y2.setTranslationY(scaleY);
                }
            } else if (!z) {
                kg5Var.setVisibility(4);
            } else {
                kg5Var.setVisibility(4);
                this.y2.f(true);
            }
        }
    }

    public final b8c l1(int i, TL_iv.RichMessage richMessage, boolean z) {
        if (richMessage == null) {
            richMessage = this.T1;
        }
        int i2 = yj9.b;
        b8c K = b8c.K(yj9.class);
        K.H = richMessage;
        K.d = i;
        K.e = z;
        return K;
    }

    public final void m1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str;
        TL_aicompose.InputAiComposeTone fromDefault;
        t1();
        boolean j1 = j1();
        jy0 jy0Var = this.o1;
        a1 a1Var = this.t2;
        if (j1) {
            String str2 = "";
            int selectedTab = a1Var.getSelectedTab();
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
                    tL_inputRichMessage.blocks.add(r7a.x0(richMessage.blocks.get(i)));
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
                tL_messages_composeRichMessageWithAI.translate_to_lang = a5c.D(this.n2);
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
                if (selectedTone instanceof u0) {
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
            TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI2 = this.Z2[selectedTab];
            if (tL_messages_composeRichMessageWithAI2 == null || tL_messages_composeRichMessageWithAI2.proofread != tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI2.emojify != tL_messages_composeRichMessageWithAI.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeRichMessageWithAI2.tone, tL_messages_composeRichMessageWithAI.tone) || !TextUtils.equals(tL_messages_composeRichMessageWithAI2.translate_to_lang, tL_messages_composeRichMessageWithAI.translate_to_lang)) {
                if (tL_messages_composeRichMessageWithAI.emojify || tL_messages_composeRichMessageWithAI.proofread || tL_messages_composeRichMessageWithAI.tone != null || tL_messages_composeRichMessageWithAI.translate_to_lang != null) {
                    this.X2 = true;
                    this.G2 = false;
                    u1(true);
                    ema titleTextView = jy0Var.getTitleTextView();
                    titleTextView.i(this.P2);
                    this.P2.start();
                    if (selectedTab == 0) {
                        this.U1 = true;
                    } else if (selectedTab == 1) {
                        this.X1 = true;
                    } else if (selectedTab == 2) {
                        this.a2 = true;
                    }
                    this.W2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeRichMessageWithAI, new ic((byte) 0), new f(this, titleTextView, selectedTab, tL_messages_composeRichMessageWithAI, (byte) 1));
                    this.Q2.O(true);
                    return;
                }
                return;
            }
            return;
        }
        String str3 = "";
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = ls6.d0(this.a).Y(charSequenceArr, true, true);
        CharSequence charSequence5 = charSequenceArr[0];
        if (charSequence5 != null) {
            str3 = charSequence5.toString();
        }
        tL_textWithEntities.text = str3;
        int selectedTab2 = a1Var.getSelectedTab();
        TLRPC.TL_messages_composeMessageWithAI a1 = a1(selectedTab2);
        a1.text = tL_textWithEntities;
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = this.Y2[selectedTab2];
        if (tL_messages_composeMessageWithAI == null || tL_messages_composeMessageWithAI.proofread != a1.proofread || tL_messages_composeMessageWithAI.emojify != a1.emojify || !TL_aicompose.InputAiComposeTone.equals(tL_messages_composeMessageWithAI.tone, a1.tone) || !TextUtils.equals(tL_messages_composeMessageWithAI.translate_to_lang, a1.translate_to_lang)) {
            if (!a1.emojify && !a1.proofread && a1.tone == null && a1.translate_to_lang == null) {
                return;
            }
            this.X2 = true;
            this.G2 = false;
            u1(true);
            ema titleTextView2 = jy0Var.getTitleTextView();
            titleTextView2.i(this.P2);
            this.P2.start();
            int selectedTab3 = a1Var.getSelectedTab();
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
            textPaint.setTextSize(hl.L(16.0f));
            int L = hl.q.x - hl.L(64.0f);
            int i4 = this.u0;
            int b = ete.b(new StaticLayout(charSequence, textPaint, (L - i4) - i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount(), 1, 10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < b; i5++) {
                if (i5 > 0) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                int L2 = hl.L((int) (Math.random() * 50.0d));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ob6.M0(2131748533, null));
                ya6 ya6Var = new ya6(null, L2, 0, null);
                ya6Var.f = hl.L(6.0f);
                ya6Var.h = 0.5f;
                ya6Var.n = true;
                spannableStringBuilder.setSpan(ya6Var, length, spannableStringBuilder.length(), 33);
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
            this.W2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(a1, new ic((byte) 0), new f(this, titleTextView2, selectedTab2, a1, (byte) 0));
            this.Q2.O(true);
        }
    }

    public final void n1(int i, int i2, boolean z) {
        if (this.j2 != null) {
            TL_iv.RichMessage g1 = g1();
            if (g1 != null) {
                this.j2.a(g1, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
            }
        } else if (this.i2 != null && h1() != null) {
            this.i2.a(h1(), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    public final void o1(long j, boolean z, mcc mccVar) {
        this.g2 = j;
        this.h2 = z;
        this.i2 = mccVar;
        if (this.S2 != null) {
            return;
        }
        ?? wkbVar = new wkb(21, this.J0, getContext(), false);
        this.S2 = wkbVar;
        Switch checkBox = wkbVar.getCheckBox();
        int i = aob.M6;
        int i2 = aob.Fi;
        int i3 = aob.d6;
        checkBox.d(i, i2, i3, i3);
        this.S2.setBackground(aob.f0(aob.v0(aob.j6, this.J0), 2, -1));
        this.S2.setOnClickListener(new b(this, (byte) 8));
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            if (v0 != this.a3) {
                this.a3 = v0;
                s0(v0);
                this.z2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1(TL_iv.RichMessage richMessage) {
        this.T1 = richMessage;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < richMessage.blocks.size(); i++) {
            if (i > 0) {
                sb.append("\n");
            }
            d1(richMessage.blocks.get(i), sb);
        }
        xqe.b(sb.toString(), new d(this, (byte) 0), new e((byte) 0), false);
        w1();
    }

    public final void q1(CharSequence charSequence) {
        String str;
        Object[] spans;
        if (!(charSequence instanceof Spanned)) {
            str = charSequence.toString();
        } else {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
            Class[] clsArr = {smb.class, jk2.class, xpa.class, i8c.class, h8c.class, e8c.class, f8c.class, no4.class, d8c.class, c8c.class, hm.class};
            for (int i = 0; i < 11; i++) {
                for (Object obj : spanned.getSpans(0, spanned.length(), clsArr[i])) {
                    spannableStringBuilder.setSpan(obj, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), 33);
                }
            }
            str = spannableStringBuilder;
        }
        this.S1 = str;
        xqe.b(charSequence.toString(), new d(this, (byte) 1), new e((byte) 1), false);
    }

    public final void r1(TL_aicompose.AiComposeTone aiComposeTone) {
        String str;
        this.p2 = aiComposeTone;
        if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
            str = aiComposeTone.title;
        } else {
            str = null;
        }
        this.o2 = str;
        b1();
        m1();
        this.Q2.O(true);
    }

    @Override
    public final void show() {
        int i;
        int i2;
        String str;
        a1 a1Var;
        super.show();
        jy0 jy0Var = this.o1;
        if (jy0Var != null) {
            jy0Var.setTitle(K0());
        }
        if (!this.h2 && (this.j2 != null || this.i2 != null)) {
            i = 0;
        } else {
            i = 8;
        }
        c51 c51Var = this.C2;
        c51Var.setVisibility(i);
        String str2 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131745368, null));
        if (this.h2) {
            i2 = 2131231154;
        } else {
            i2 = 2131232710;
        }
        wm2 wm2Var = new wm2(i2, 0);
        wm2Var.s = hl.L(1.0f);
        spannableStringBuilder.setSpan(wm2Var, 0, spannableStringBuilder.length(), 33);
        c51Var.setText(spannableStringBuilder);
        if (!this.U2 && i1()) {
            this.U2 = true;
            ec b = fc.b(this.a, this.g2);
            if (b != null) {
                int i3 = b.f;
                a1 a1Var2 = this.t2;
                if (i3 == 1) {
                    TL_aicompose.AiComposeTone a = fc.a(this.a, b.d);
                    if (a != null && (a1Var = this.u2) != null) {
                        this.q2 = b.b;
                        a1Var2.c(1, false);
                        a1Var.d(a, false);
                    }
                } else if (i3 == 0 && (str = b.c) != null) {
                    this.q2 = b.b;
                    this.n2 = str;
                    TL_aicompose.AiComposeTone a2 = fc.a(this.a, b.d);
                    this.p2 = a2;
                    if (a2 != null && !TextUtils.isEmpty(a2.title)) {
                        str2 = this.p2.title;
                    }
                    this.o2 = str2;
                    a1Var2.c(0, false);
                } else if (i3 == 2) {
                    a1Var2.c(2, false);
                }
            }
        }
        this.Q2.O(false);
        m1();
        u1(true);
    }

    public final void t1() {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        boolean z2;
        float f;
        if (!i1()) {
            return;
        }
        ec b = fc.b(this.a, this.g2);
        ec c1 = c1();
        if (b != null && c1 != null && (b.f != c1.f || b.a != c1.a || b.b != c1.b || !TextUtils.equals(b.c, c1.c) || !TL_aicompose.InputAiComposeTone.equals(fc.d(b.d), fc.d(c1.d)) || !TextUtils.equals(b.e, c1.e))) {
            fc.e(this.a, this.g2, c1);
            fw1 fw1Var = this.T2;
            if (fw1Var != null) {
                fw1Var.run();
            }
            b = c1;
        }
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c1 = b;
        }
        i0 i0Var = this.S2;
        if (!i0Var.L) {
            i0Var.L = true;
            i0Var.g("Always use in this chat", "", false, false, false);
        }
        if (c1 != null) {
            if (this.V2 == null) {
                this.V2 = new j0();
            }
            spannableStringBuilder = new SpannableStringBuilder("→");
            spannableStringBuilder.setSpan(this.V2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) c1.e);
        } else {
            spannableStringBuilder = null;
        }
        i0 i0Var2 = this.S2;
        if (i0Var2.isLaidOut() && this.S2.isAttachedToWindow()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (spannableStringBuilder != null) {
            i0Var2.getValueTextView().setText(spannableStringBuilder);
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (i0Var2.N != f || (i0Var2.O == null && i0Var2.M != f)) {
            i0Var2.N = f;
            ValueAnimator valueAnimator = i0Var2.O;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                i0Var2.O.cancel();
                i0Var2.O = null;
            }
            if (!z2) {
                i0Var2.M = f;
                i0Var2.requestLayout();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i0Var2.M, f);
                i0Var2.O = ofFloat;
                ofFloat.addUpdateListener(new g0(i0Var2, (byte) 0));
                i0Var2.O.addListener(new h0(i0Var2, (byte) 0));
                i0Var2.O.setDuration(240L);
                i0Var2.O.setInterpolator(k43.h);
                i0Var2.O.start();
            }
        }
        this.S2.setChecked(z);
    }

    public final void u1(boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        long max;
        boolean z2 = this.G2;
        int i3 = 0;
        c51 c51Var = this.B2;
        if (z2) {
            c51Var.setText(ob6.M0(2131747558, null));
            c51Var.setOnClickListener(new b(this, (byte) 0));
        } else {
            a1 a1Var = this.t2;
            if (a1Var != null) {
                i = a1Var.getSelectedTab();
            } else {
                i = 0;
            }
            if (i == 1 && (this.u2.getSelectedTone() instanceof u0) && !TextUtils.equals(this.x2.getText().toString(), this.F2)) {
                c51Var.setText(ob6.M0(2131754052, null));
                c51Var.setOnClickListener(new b(this, (byte) 1));
            } else if (this.f2 == null && this.e2 == null) {
                c51Var.setText(ob6.M0(2131747558, null));
                c51Var.setOnClickListener(new b(this, (byte) 3));
            } else {
                c51Var.setText(ob6.M0(2131754999, null));
                c51Var.setOnClickListener(new b(this, (byte) 2));
            }
        }
        boolean z3 = this.X2;
        xac xacVar = this.L2;
        if (xacVar != null) {
            hl.r(xacVar);
            this.L2 = null;
        }
        if (z3 != this.J2) {
            if (z3) {
                max = 150;
            } else {
                max = Math.max(0L, 300 - (SystemClock.uptimeMillis() - this.K2));
            }
            xac xacVar2 = new xac((byte) 1, this, z3);
            this.L2 = xacVar2;
            if (max <= 0) {
                xacVar2.run();
            } else {
                hl.d3(xacVar2, max);
            }
        }
        if (z && this.I2 == this.H2) {
            return;
        }
        boolean z4 = this.H2;
        this.I2 = z4;
        c51 c51Var2 = this.A2;
        float f3 = 0.0f;
        LinearLayout linearLayout = this.z2;
        if (z) {
            c51Var2.setVisibility(0);
            linearLayout.setVisibility(0);
            ViewPropertyAnimator animate = c51Var2.animate();
            if (this.H2) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f2);
            k43 k43Var = k43.h;
            alpha.setInterpolator(k43Var).setDuration(320L).withEndAction(new a(this, (byte) 1)).start();
            ViewPropertyAnimator animate2 = linearLayout.animate();
            if (!this.H2) {
                f3 = 1.0f;
            }
            animate2.alpha(f3).setInterpolator(k43Var).setDuration(320L).withEndAction(new a(this, (byte) 2)).start();
            return;
        }
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c51Var2.setVisibility(i2);
        if (this.H2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c51Var2.setAlpha(f);
        if (this.H2) {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
        if (!this.H2) {
            f3 = 1.0f;
        }
        linearLayout.setAlpha(f3);
    }

    public final void v1() {
        float f;
        String str = this.F2;
        zt3 zt3Var = this.x2;
        boolean equals = TextUtils.equals(str, zt3Var.d.getText().toString());
        boolean z = !equals;
        if (this.E2 == z) {
            return;
        }
        ViewPropertyAnimator animate = zt3Var.d.animate();
        this.E2 = z;
        if (!equals) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        ik8.s(animate, f, 320L);
        this.Q2.O(true);
    }

    public final void w1() {
        a1 a1Var = this.u2;
        TL_aicompose.AiComposeTone selectedTone = a1Var.getSelectedTone();
        a1Var.c.removeAllViews();
        if (j1()) {
            a1Var.b(new TL_aicompose.AiComposeTone(), new h(this, (byte) 0));
        }
        a1Var.b(null, new h(this, (byte) 0));
        ArrayList arrayList = this.r2.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a1Var.b((TL_aicompose.AiComposeTone) obj, new h(this, (byte) 0));
        }
        if (selectedTone != a1Var.getSelectedTone()) {
            a1Var.d(null, true);
        }
    }
}
