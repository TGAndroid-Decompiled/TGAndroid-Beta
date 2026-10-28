package li;

import a8.zd;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.xm0;
public final class d6 extends FrameLayout implements p6, r9 {
    public static final int f17192a0 = 0;
    public boolean E;
    public boolean F;
    public i2 G;
    public String H;
    public int I;
    public xm0 J;
    public Drawable K;
    public kj0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public z5 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final u6 f17193a;
    public final LinearLayout f17194b;
    public final View f17195c;
    public final ei.n d;
    public final cc e;
    public final g1 f17196f;
    public final g1 h;
    public boolean f17197n;
    public final ArrayList f17198r;
    public LinearLayout f17199s;
    public TextView v;
    public ImageView f17200w;
    public a f17201x;
    public a6 f17202y;

    public d6(Context context, u6 u6Var) {
        super(context);
        this.f17198r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.f17193a = u6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f17194b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f17195c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ei.n nVar = new ei.n(this, context);
        this.d = nVar;
        nVar.setGravity(8388627);
        nVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        nVar.setSingleLine(true);
        nVar.setIncludeFontPadding(false);
        nVar.setTextSize(1, 16.0f);
        linearLayout.addView(nVar, kb1.r(18, -2));
        cc ccVar = new cc(context, u6Var);
        this.e = ccVar;
        ccVar.setVisibility(8);
        ccVar.setOnClickListener(new u5(this, 0));
        linearLayout.addView(ccVar, kb1.r(18, -2));
        g1 g1Var = new g1(context, u6Var);
        this.f17196f = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        g1Var.setListener(new x5(this));
        g1Var.setDelegate(new hu(this) {
            public final d6 f17580b;

            {
                this.f17580b = this;
            }

            @Override
            public final void g() {
                switch (r2) {
                    case 0:
                        d6 d6Var = this.f17580b;
                        if (!d6Var.S && d6Var.f17201x != null) {
                            d6Var.J();
                            d6.d(d6Var.f17201x.f17053b, d6Var.f17196f.getText());
                            a6 a6Var = d6Var.f17202y;
                            if (a6Var != null) {
                                v3.U1(((d3) a6Var).f17188a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d6 d6Var2 = this.f17580b;
                        if (d6Var2.f17201x != null) {
                            d6Var2.v();
                            a6 a6Var2 = d6Var2.f17202y;
                            if (a6Var2 != null) {
                                v3.U1(((d3) a6Var2).f17188a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        g1Var.setOnFocusChangeListener(new bh.j0(this, 5));
        linearLayout.addView(g1Var, kb1.p(1.0f, 0, -2));
        addView(linearLayout, kb1.i(-1, -2, 51));
        g1 g1Var2 = new g1(context, u6Var);
        this.h = g1Var2;
        g1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        g1Var2.setAllowNewlines(false);
        g1Var2.setInputType(147457);
        g1Var2.setListener(new y5(this));
        g1Var2.setDelegate(new hu(this) {
            public final d6 f17580b;

            {
                this.f17580b = this;
            }

            @Override
            public final void g() {
                switch (r2) {
                    case 0:
                        d6 d6Var = this.f17580b;
                        if (!d6Var.S && d6Var.f17201x != null) {
                            d6Var.J();
                            d6.d(d6Var.f17201x.f17053b, d6Var.f17196f.getText());
                            a6 a6Var = d6Var.f17202y;
                            if (a6Var != null) {
                                v3.U1(((d3) a6Var).f17188a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d6 d6Var2 = this.f17580b;
                        if (d6Var2.f17201x != null) {
                            d6Var2.v();
                            a6 a6Var2 = d6Var2.f17202y;
                            if (a6Var2 != null) {
                                v3.U1(((d3) a6Var2).f17188a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        g1Var2.setVisibility(8);
        addView(g1Var2, kb1.i(-1, -2, 51));
        H();
    }

    public static void a(d6 d6Var, boolean z10) {
        a6 a6Var;
        d6Var.f17196f.setHint(d6Var.getHint());
        if (!z10 && (a6Var = d6Var.f17202y) != null) {
            ((d3) a6Var).f17188a.f17556p3.p(d6Var, null);
        }
    }

    public static String b(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
            return null;
        }
        return null;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = f6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f17201x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f17053b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f17064p) {
                i10 = R.string.ArticleHintTitle;
            } else {
                i10 = R.string.ArticleHeading1;
            }
            return LocaleController.getString(i10);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return LocaleController.getString(R.string.ArticleHeading3);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return LocaleController.getString(R.string.ArticleHeading4);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return LocaleController.getString(R.string.ArticleHeading5);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return LocaleController.getString(R.string.ArticleHeading6);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return LocaleController.getString(R.string.ArticleHintCode);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return LocaleController.getString(R.string.ArticleHintQuote);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return LocaleController.getString(R.string.ArticleHintQuote);
            }
            if (!aVar.f17065q) {
                return null;
            }
            return LocaleController.getString(R.string.ArticleHintText);
        }
    }

    public static void i(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
            }
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static TL_iv.RichText j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean l(g1 g1Var, int i10, int i11, int i12, int i13) {
        if (g1Var.length() != 0 || i12 < i10 || i12 > g1Var.getWidth() + i10 || i13 < i11 || i13 > g1Var.getHeight() + i11) {
            return false;
        }
        return true;
    }

    public static boolean o(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!lowerCase.equals("/img") && !lowerCase.equals("/pic") && !lowerCase.equals("/image") && !lowerCase.equals("/picture") && !lowerCase.equals("/photo")) {
            if (!lowerCase.equals("/vid") && !lowerCase.equals("/video")) {
                if (!lowerCase.equals("/audio") && !lowerCase.equals("/music")) {
                    if (!lowerCase.equals("/map") && !lowerCase.equals("/location") && !lowerCase.equals("/loc")) {
                        if (!lowerCase.equals("/latex") && !lowerCase.equals("/equation") && !lowerCase.equals("/math")) {
                            if (!lowerCase.equals("/toggle") && !lowerCase.equals("/details")) {
                                if (!lowerCase.equals("/button")) {
                                    return 0;
                                }
                                return 7;
                            }
                            return 6;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 5;
        }
        return 4;
    }

    public static c6 q(String str, a aVar) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new c6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new c6(u(charAt - '0'), aVar.f17054c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new c6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new c6(pageblockpullquote, 0, 0);
                    } else if (lowerCase.equals("/table") || lowerCase.startsWith("/table ")) {
                        if (lowerCase.length() > 7) {
                            String trim2 = lowerCase.substring(7).trim();
                            int indexOf = trim2.indexOf(120);
                            if (indexOf < 0) {
                                indexOf = trim2.indexOf(88);
                            }
                            if (indexOf > 0) {
                                try {
                                    i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                                    try {
                                        i12 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    } catch (NumberFormatException unused) {
                                    }
                                } catch (NumberFormatException unused2) {
                                    i11 = 2;
                                }
                                i10 = i12;
                                i12 = i11;
                                return new c6(t(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new c6(t(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new c6(pageblockblockquote, 0, 0);
            }
            return new c6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static c6 r(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f17053b;
                boolean z11 = pageBlock instanceof TL_iv.pageBlockParagraph;
                if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (str.charAt(0) == '#' && (z11 || z10)) {
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        if (str.charAt(i12) == '#') {
                            i11++;
                        } else {
                            return null;
                        }
                    }
                    if (i11 >= 1 && i11 <= 6) {
                        return new c6(u(i11), aVar.f17054c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f17054c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new c6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new c6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f17054c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return s(false);
                    }
                    if (aVar.f17054c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return s(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return s(true);
                        }
                    }
                    if (aVar.f17054c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new c6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f17054c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new c6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new c6(new TL_iv.pageBlockPreformatted(), 0, 0);
                        }
                        return null;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static c6 s(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new c6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable t(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(h6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i10) {
        switch (i10) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean x(g1 g1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = g1Var.getLayout();
        if (layout != null && g1Var.length() != 0) {
            int paddingLeft = i12 - (g1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (g1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (g1Var.getWidth() - g1Var.getPaddingLeft()) - g1Var.getPaddingRight());
                float f7 = dp;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f7);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f7);
                float f10 = paddingLeft;
                if (f10 >= max2 && f10 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String y(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return f6.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return f6.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f17196f.r();
    }

    public final void B() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f17201x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                i2 i2Var = new i2(this, 1);
                this.G = i2Var;
                postDelayed(i2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f17196f.getText();
        if (text != null) {
            for (ni.d dVar : (ni.d[]) text.getSpans(0, text.length(), ni.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.H = null;
    }

    public final void C(m0 m0Var) {
        if (this.f17202y != null && this.f17201x != null && m0Var != null) {
            List<String> list = m0Var.f17354c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int p10 = p(str);
                    if (p10 != 0) {
                        ((d3) this.f17202y).c(this.f17201x, p10);
                        return;
                    }
                    c6 q5 = q(str, this.f17201x);
                    if (q5 == null) {
                        q5 = r(b10.u(str, " "), this.f17201x);
                        continue;
                    }
                    if (q5 != null) {
                        ((d3) this.f17202y).d(this.f17201x, q5.f17175a, q5.f17176b, q5.f17177c, q5.d, q5.e);
                        return;
                    }
                }
            }
        }
    }

    public final void D(Editable editable) {
        org.telegram.ui.Components.c6[] c6VarArr;
        a aVar = this.f17201x;
        if (aVar != null && v3.I3(aVar.f17053b) && c3.h0.t(editable)) {
            g1 g1Var = this.f17196f;
            Paint.FontMetricsInt fontMetricsInt = g1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((g1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.c6 c6Var : (org.telegram.ui.Components.c6[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.c6.class)) {
                c6Var.replaceFontMetrics(fontMetricsInt);
                c6Var.setSize(max);
            }
        }
    }

    public final void E() {
        a6 a6Var;
        int i10;
        int i11;
        a aVar = this.f17201x;
        if (aVar != null && aVar.f17054c > 0 && (a6Var = this.f17202y) != null) {
            int b10 = ((d3) a6Var).b(aVar);
            int a2 = ((d3) this.f17202y).a(this.f17201x);
            a aVar2 = this.f17201x;
            if (aVar2.f17062n) {
                if (aVar2.f17060l <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(c3.h0.w(i11, 1, 16, 10));
                }
            }
            a aVar3 = this.f17201x;
            if (aVar3.f17063o) {
                if (aVar3.f17061m <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(c3.h0.w(i10, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void F() {
        a aVar = this.f17201x;
        g1 g1Var = this.f17196f;
        g1 g1Var2 = this.h;
        if (aVar != null && o(aVar.f17053b) && (g1Var.length() > 0 || g1Var2.length() > 0)) {
            if (g1Var2.getVisibility() != 0) {
                g1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (g1Var2.getVisibility() != 8) {
            if (g1Var2.isFocused()) {
                g1Var.requestFocus();
            }
            g1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void G() {
        int i10;
        Layout layout;
        int lineStart;
        g1 g1Var = this.f17196f;
        if (g1Var.getText() != null) {
            Editable text = g1Var.getText();
            int i11 = -1;
            if (!n() || !((TL_iv.pageBlockBlockquote) this.f17201x.f17053b).collapsed || (layout = g1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                z5 z5Var = this.P;
                if (z5Var != null) {
                    text.removeSpan(z5Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new z5(this, 0);
                    }
                    text.setSpan(this.P, i11, i10, 33);
                }
                this.S = false;
                this.Q = i11;
                this.R = i10;
            } catch (Throwable th2) {
                this.S = false;
                throw th2;
            }
        }
    }

    public final void H() {
        this.f17196f.updateColors();
        g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.updateColors();
        }
        int i10 = y6.G6;
        u6 u6Var = this.f17193a;
        this.d.setTextColor(y6.w0(i10, u6Var));
        if (this.K != null) {
            int w02 = y6.w0(y6.Oh, u6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        xm0 xm0Var = this.J;
        if (xm0Var != null) {
            zd.a(xm0Var, u6Var);
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        float f7;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f17199s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f17199s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f17199s = null;
        }
        if (this.f17199s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f17199s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f17199s;
            int i10 = y6.f23449i6;
            f7.R(linearLayout4, y6.Z(y6.w0(i10, this.f17193a), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)), null, f7.N(i10), this.f17193a);
            this.f17199s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f17199s, kb1.h(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f17199s.addView(this.v, kb1.x(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f17200w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f17199s.addView(this.f17200w, kb1.v(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ni.q qVar = ni.k.f18886a;
            synchronized (qVar.f18897a) {
                try {
                    if (!qVar.f18903s) {
                        qVar.d.execute(new ni.l(qVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f17199s.setOnClickListener(new u5(this, 1));
            this.f17199s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = y6.G6;
        int w02 = y6.w0(i11, this.f17193a);
        float f10 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f7 = 0.5f;
        } else {
            f7 = 0.75f;
        }
        y6.o1(f7, w02);
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        }
        b7 L = f7.L(f10, i11);
        ImageView imageView2 = this.f17200w;
        u6 u6Var = this.f17193a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = L.f22486a;
        float f11 = L.d;
        int Q = f7.Q(i12, -1, 2, f11, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        f7.O(imageView2, 5, i12, -1, 2, f11, u6Var, Q, porterDuffColorFilter).h = mode;
        f7.W(this.v, L, this.f17193a);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f17199s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f17201x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            g1 g1Var = this.f17196f;
            if (g1Var.length() > 0 && (g1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f17201x;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Oh));
    }

    public final void c(a aVar) {
        int i10;
        int z10;
        int i11;
        a aVar2;
        int i12;
        String n10;
        int i13 = aVar.f17054c;
        cc ccVar = this.e;
        View view = this.f17195c;
        ei.n nVar = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            nVar.setVisibility(8);
            ccVar.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i13 - 1);
        view.setLayoutParams(layoutParams);
        if (i13 > 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (aVar.e) {
            nVar.setVisibility(8);
            ccVar.setVisibility(0);
            ((CheckBoxBase) ccVar.f4466b).f(-1, aVar.f17055f, false);
            return;
        }
        ccVar.setVisibility(8);
        nVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nVar.getLayoutParams();
        if (aVar.d == 0) {
            z10 = AndroidUtilities.dp(18.0f);
        } else {
            a6 a6Var = this.f17202y;
            if (a6Var != null) {
                TextPaint paint = nVar.getPaint();
                ArrayList arrayList = ((d3) a6Var).f17188a.f17564t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f17054c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f17054c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f17054c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f7 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f17054c == i11 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                } else {
                    z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(paint.measureText(a1.g.n(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = nVar.getPaint();
                z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != z10) {
            layoutParams2.width = z10;
            nVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            n10 = "";
        } else {
            n10 = a1.g.n(aVar.d, ".", new StringBuilder());
        }
        nVar.setText(n10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g1 g1Var;
        Canvas canvas2;
        float f7;
        s9 s9Var;
        int dp;
        float f10;
        float f11;
        int i10;
        int dp2;
        a aVar = this.f17201x;
        LinearLayout linearLayout = this.f17194b;
        Paint paint = this.W;
        u6 u6Var = this.f17193a;
        g1 g1Var2 = this.f17196f;
        if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(y6.w0(y6.xk, u6Var));
            int c10 = zd.c(this.f17201x);
            int d = zd.d(this.f17201x);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i10 = 0;
            } else {
                int dp3 = AndroidUtilities.dp(16.0f) + c10;
                int dp4 = AndroidUtilities.dp(16.0f) + d;
                if (LocaleController.isRTL) {
                    i10 = dp4;
                } else {
                    i10 = dp3;
                }
                int width2 = getWidth();
                if (!LocaleController.isRTL) {
                    dp3 = dp4;
                }
                width = width2 - dp3;
            }
            if (i10 <= 0 && width >= getWidth()) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(8.0f);
            }
            float f12 = dp2;
            g1Var = g1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f12, f12, paint);
            canvas2 = canvas;
        } else {
            g1Var = g1Var2;
            if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    xm0 xm0Var = new xm0(this);
                    this.J = xm0Var;
                    xm0Var.a(null, null, null, this.f17193a, 1);
                    zd.a(this.J, u6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.J.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        xm0 xm0Var2 = new xm0(this);
                        this.J = xm0Var2;
                        xm0Var2.a(null, null, null, this.f17193a, 1);
                        zd.a(this.J, u6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.Oh, u6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = g1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = g1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + g1Var.getPaddingLeft() + left);
                            int left2 = g1Var.getLeft() + linearLayout.getLeft();
                            f7 = Math.max(f7, layout.getLineRight(i11) + g1Var.getPaddingLeft() + left2);
                        }
                    } else if (g1Var.getHint() != null) {
                        float measureText = g1Var.getPaint().measureText(g1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    g1 g1Var3 = this.h;
                    if (g1Var3.getVisibility() == 0) {
                        Layout layout2 = g1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = g1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + g1Var3.getPaddingLeft() + left3);
                                int left4 = g1Var3.getLeft();
                                f7 = Math.max(f7, layout2.getLineRight(i12) + g1Var3.getPaddingLeft() + left4);
                            }
                        } else if (g1Var3.getHint() != null) {
                            float measureText2 = g1Var3.getPaint().measureText(g1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            f7 = Math.max(f7, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width3 < f7) {
                        float dp5 = width3 - AndroidUtilities.dp(30.0f);
                        float dp6 = AndroidUtilities.dp(30.0f) + f7;
                        float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int dp7 = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(dp5, dp7, dp6, height);
                        this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                        canvas2.save();
                        int i13 = (int) dp5;
                        this.K.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + dp7, this.K.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.K.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp7);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) dp6;
                        this.K.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.K.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.K.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                    }
                }
            }
        }
        if (this.V) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = g1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + g1Var.getPaddingTop() + getPaddingTop());
                    int left5 = g1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + g1Var.getPaddingLeft() + left5);
                    int left6 = g1Var.getLeft() + linearLayout.getLeft();
                    f10 = Math.max(f10, layout3.getLineRight(i15) + g1Var.getPaddingLeft() + left6);
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + g1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float dp8 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(y6.o1(0.05f, y6.w0(y6.G6, u6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp8, height2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + f10, f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        a6 a6Var = this.f17202y;
        if (a6Var != null) {
            s9Var = ((d3) a6Var).f17188a.getTextSelectionHelper();
        } else {
            s9Var = null;
        }
        if (s9Var != null) {
            ArrayList arrayList = this.f17198r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                da daVar = (da) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(daVar.getX(), daVar.getY());
                s9Var.Z(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!n()) {
            return;
        }
        if (this.L == null) {
            this.L = new kj0(this);
        }
        int w02 = y6.w0(y6.Oh, u6Var);
        float C = org.telegram.messenger.t.C(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        Canvas canvas4 = canvas2;
        this.L.a(canvas4, this.M, org.telegram.messenger.t.C(16.0f, getWidth(), dp), C, w02, ((TL_iv.pageBlockBlockquote) this.f17201x.f17053b).collapsed, k());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (k() && this.L != null) {
            boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.N) {
                            this.N = false;
                            this.L.b(false);
                            return true;
                        }
                    } else if (this.N) {
                        this.L.b(contains);
                        return true;
                    }
                } else if (this.N) {
                    this.N = false;
                    this.L.b(false);
                    if (contains && n()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f17201x.f17053b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        G();
                        invalidate();
                        a6 a6Var = this.f17202y;
                        if (a6Var != null) {
                            v3 v3Var = ((d3) a6Var).f17188a;
                            f2 f2Var = v3Var.R3;
                            if (f2Var != null) {
                                f2Var.g();
                            }
                            v3Var.f17556p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.N = true;
                this.L.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f(li.a r25, li.a6 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: li.d6.f(li.a, li.a6, boolean):void");
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        g1 g1Var = this.f17196f;
        Layout layout2 = g1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f17194b;
            arrayList.add(new d5(layout2, g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft(), g1Var.getPaddingTop() + g1Var.getTop() + linearLayout.getTop(), 1));
        }
        g1 g1Var2 = this.h;
        if (g1Var2.getVisibility() == 0 && (layout = g1Var2.getLayout()) != null) {
            arrayList.add(new d5(layout, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop(), 2));
        }
    }

    public final int g(int i10, int i11) {
        Layout layout;
        kj0 kj0Var;
        int dp;
        boolean z10;
        if (k()) {
            g1 g1Var = this.h;
            if (g1Var.getVisibility() == 0 && (layout = g1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new kj0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f17194b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + g1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.L.getClass();
                float C = org.telegram.messenger.t.C(16.0f, i10, dp2) - wh.b(3.333f, 2, AndroidUtilities.dp(23.66f) + kj0Var.f29973c);
                this.L.getClass();
                int i12 = i11 - dp2;
                float dp3 = i12 - AndroidUtilities.dp(17.66f);
                float f7 = i12;
                if (lineRight > C) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (lineBottom <= dp3 || lineTop >= f7) {
                    z11 = false;
                }
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + dp) + dp2) - i11));
                }
            }
        }
        return 0;
    }

    public g1 getAuthorEditText() {
        return this.h;
    }

    public g1 getEditText() {
        return this.f17196f;
    }

    public a getRow() {
        return this.f17201x;
    }

    public org.telegram.ui.ActionBar.b5 getStyleDelegate() {
        return this.f17196f;
    }

    public final void h() {
        a aVar = this.f17201x;
        if (aVar != null) {
            i(aVar.f17053b);
        }
        g1 g1Var = this.h;
        if (g1Var.getVisibility() != 0) {
            g1Var.setVisibility(0);
            requestLayout();
        }
        g1Var.r();
        g1Var.setSelection(g1Var.length());
    }

    public final boolean k() {
        Layout layout;
        if (!n() || (layout = this.f17196f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        a aVar = this.f17201x;
        if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        G();
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f17194b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        g1Var.layout(paddingLeft, measuredHeight, g1Var.getMeasuredWidth() + paddingLeft, g1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        E();
        int size = View.MeasureSpec.getSize(i10);
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f17194b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        g1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + g1Var.getMeasuredHeight() + measuredHeight;
        int g7 = g(size, paddingBottom);
        this.O = g7;
        setMeasuredDimension(size, paddingBottom + g7);
    }

    public void setLocked(boolean z10) {
        this.f17196f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            H();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.f23357d6, this.f17193a));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v() {
        a aVar = this.f17201x;
        if (aVar != null && o(aVar.f17053b)) {
            TL_iv.PageBlock pageBlock = this.f17201x.f17053b;
            TL_iv.RichText f7 = f6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            kj0 kj0Var = this.L;
            if (kj0Var != null) {
                if (drawable != kj0Var.f29972b && drawable != kj0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f17201x;
        if (aVar != null) {
            d(aVar.f17053b, this.f17196f.getText());
        }
    }
}
