package ii;

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
import ci.bb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.vi0;
import v7.p8;
public final class e6 extends FrameLayout implements org.telegram.ui.ActionBar.x5, p9 {
    public static final int V = 0;
    public boolean E;
    public boolean F;
    public l2 G;
    public String H;
    public int I;
    public dm0 J;
    public Drawable K;
    public vi0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public a6 P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public final Paint U;
    public final org.telegram.ui.ActionBar.d6 f11346a;
    public final LinearLayout f11347b;
    public final View f11348c;
    public final bi.o d;
    public final bb e;
    public final i1 f11349f;
    public final i1 h;
    public boolean f11350n;
    public final ArrayList f11351r;
    public LinearLayout f11352s;
    public TextView v;
    public ImageView f11353w;
    public a f11354x;
    public b6 f11355y;

    public e6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f11351r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.U = new Paint(1);
        this.f11346a = d6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11347b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f11348c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        bi.o oVar = new bi.o(this, context);
        this.d = oVar;
        oVar.setGravity(8388627);
        oVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        oVar.setSingleLine(true);
        oVar.setIncludeFontPadding(false);
        oVar.setTextSize(1, 16.0f);
        linearLayout.addView(oVar, w7.y5.n(18, -2));
        bb bbVar = new bb(context, d6Var);
        this.e = bbVar;
        bbVar.setVisibility(8);
        bbVar.setOnClickListener(new u5(this, 0));
        linearLayout.addView(bbVar, w7.y5.n(18, -2));
        i1 i1Var = new i1(context, d6Var);
        this.f11349f = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        i1Var.setListener(new y5(this));
        i1Var.setDelegate(new au(this) {
            public final e6 f11687b;

            {
                this.f11687b = this;
            }

            @Override
            public final void j() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f11687b;
                        if (!e6Var.S && e6Var.f11354x != null) {
                            e6Var.J();
                            e6.d(e6Var.f11354x.f11191b, e6Var.f11349f.getText());
                            b6 b6Var = e6Var.f11355y;
                            if (b6Var != null) {
                                x3.O1(((f3) b6Var).f11363a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e6 e6Var2 = this.f11687b;
                        if (e6Var2.f11354x != null) {
                            e6Var2.w();
                            b6 b6Var2 = e6Var2.f11355y;
                            if (b6Var2 != null) {
                                x3.O1(((f3) b6Var2).f11363a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        i1Var.setOnFocusChangeListener(new w5(this, 0));
        linearLayout.addView(i1Var, w7.y5.l(1.0f, 0, -2));
        addView(linearLayout, w7.y5.e(-1, -2, 51));
        i1 i1Var2 = new i1(context, d6Var);
        this.h = i1Var2;
        i1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var2.setAllowNewlines(false);
        i1Var2.setInputType(147457);
        i1Var2.setListener(new z5(this));
        i1Var2.setDelegate(new au(this) {
            public final e6 f11687b;

            {
                this.f11687b = this;
            }

            @Override
            public final void j() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f11687b;
                        if (!e6Var.S && e6Var.f11354x != null) {
                            e6Var.J();
                            e6.d(e6Var.f11354x.f11191b, e6Var.f11349f.getText());
                            b6 b6Var = e6Var.f11355y;
                            if (b6Var != null) {
                                x3.O1(((f3) b6Var).f11363a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e6 e6Var2 = this.f11687b;
                        if (e6Var2.f11354x != null) {
                            e6Var2.w();
                            b6 b6Var2 = e6Var2.f11355y;
                            if (b6Var2 != null) {
                                x3.O1(((f3) b6Var2).f11363a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        i1Var2.setVisibility(8);
        addView(i1Var2, w7.y5.e(-1, -2, 51));
        e();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return g6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(e6 e6Var, boolean z10) {
        b6 b6Var;
        e6Var.f11349f.setHint(e6Var.getHint());
        if (!z10 && (b6Var = e6Var.f11355y) != null) {
            ((f3) b6Var).f11363a.f11728h3.g(e6Var, null);
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
        pageBlock.text = g6.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f11354x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f11191b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f11202p) {
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
            if (!aVar.f11203q) {
                return null;
            }
            return LocaleController.getString(R.string.ArticleHintText);
        }
    }

    public static void j(TL_iv.PageBlock pageBlock) {
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

    public static TL_iv.RichText k(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(i1 i1Var, int i10, int i11, int i12, int i13) {
        if (i1Var.length() != 0 || i12 < i10 || i12 > i1Var.getWidth() + i10 || i13 < i11 || i13 > i1Var.getHeight() + i11) {
            return false;
        }
        return true;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static int q(String str) {
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

    public static d6 r(a aVar, String str) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new d6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new d6(v(charAt - '0'), aVar.f11192c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new d6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new d6(pageblockpullquote, 0, 0);
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
                                } catch (NumberFormatException unused) {
                                    i11 = 2;
                                }
                                try {
                                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                                    i12 = i11;
                                } catch (NumberFormatException unused2) {
                                    i12 = i11;
                                    i10 = 2;
                                    return new d6(u(i12, i10), 0, 0);
                                }
                                return new d6(u(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new d6(u(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new d6(pageblockblockquote, 0, 0);
            }
            return new d6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static d6 s(a aVar, String str) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f11191b;
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
                        return new d6(v(i11), aVar.f11192c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f11192c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new d6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f(pageblockparagraph, "");
                            return new d6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f11192c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f11192c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f11192c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        f(pageblockparagraph2, "");
                        return new d6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f11192c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new d6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new d6(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static d6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new d6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(i6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i10) {
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

    public static boolean y(i1 i1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = i1Var.getLayout();
        if (layout != null && i1Var.length() != 0) {
            int paddingLeft = i12 - (i1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (i1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (i1Var.getWidth() - i1Var.getPaddingLeft()) - i1Var.getPaddingRight());
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

    public static String z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return g6.l(pageBlock.text);
    }

    public final void B() {
        this.f11349f.r();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f11354x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                l2 l2Var = new l2(this, 1);
                this.G = l2Var;
                postDelayed(l2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f11349f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.H = null;
    }

    public final void D(o0 o0Var) {
        if (this.f11355y != null && this.f11354x != null && o0Var != null) {
            List<String> list = o0Var.f11521c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q6 = q(str);
                    if (q6 != 0) {
                        ((f3) this.f11355y).c(this.f11354x, q6);
                        return;
                    }
                    d6 r10 = r(this.f11354x, str);
                    if (r10 == null) {
                        r10 = s(this.f11354x, v7.j.t(str, " "));
                        continue;
                    }
                    if (r10 != null) {
                        ((f3) this.f11355y).d(this.f11354x, r10.f11297a, r10.f11298b, r10.f11299c, r10.d, r10.e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.z5[] z5VarArr;
        a aVar = this.f11354x;
        if (aVar != null && x3.C3(aVar.f11191b) && com.google.android.gms.internal.vision.e2.u(editable)) {
            i1 i1Var = this.f11349f;
            Paint.FontMetricsInt fontMetricsInt = i1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((i1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.z5.class)) {
                z5Var.replaceFontMetrics(fontMetricsInt);
                z5Var.setSize(max);
            }
        }
    }

    public final void F() {
        b6 b6Var;
        a aVar = this.f11354x;
        if (aVar != null && aVar.f11192c > 0 && (b6Var = this.f11355y) != null) {
            int b10 = ((f3) b6Var).b(aVar);
            int a2 = ((f3) this.f11355y).a(this.f11354x);
            a aVar2 = this.f11354x;
            if (aVar2.f11200n) {
                int i10 = aVar2.f11198l;
                if (i10 <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(hg.c.f(i10, 1, 16, 10));
                }
            }
            a aVar3 = this.f11354x;
            if (aVar3.f11201o) {
                int i11 = aVar3.f11199m;
                if (i11 <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(hg.c.f(i11, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f11354x;
        i1 i1Var = this.f11349f;
        i1 i1Var2 = this.h;
        if (aVar != null && p(aVar.f11191b) && (i1Var.length() > 0 || i1Var2.length() > 0)) {
            if (i1Var2.getVisibility() != 0) {
                i1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (i1Var2.getVisibility() != 8) {
            if (i1Var2.isFocused()) {
                i1Var.requestFocus();
            }
            i1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        i1 i1Var = this.f11349f;
        if (i1Var.getText() != null) {
            Editable text = i1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f11354x.f11191b).collapsed || (layout = i1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                a6 a6Var = this.P;
                if (a6Var != null) {
                    text.removeSpan(a6Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new a6(0, this);
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

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        float f7;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f11352s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f11352s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f11352s = null;
        }
        LinearLayout linearLayout3 = this.f11352s;
        org.telegram.ui.ActionBar.d6 d6Var = this.f11346a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.f11352s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.f11352s.setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19134i6, d6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f11352s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f11352s, w7.y5.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f11352s.addView(this.v, w7.y5.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f11353w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f11352s.addView(this.f11353w, w7.y5.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.f11352s.setOnClickListener(new u5(this, 1));
            this.f11352s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var);
        if (TextUtils.isEmpty(str)) {
            f7 = 0.5f;
        } else {
            f7 = 0.75f;
        }
        int l1 = org.telegram.ui.ActionBar.h6.l1(f7, v02);
        this.f11353w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f11352s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f11354x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            i1 i1Var = this.f11349f;
            if (i1Var.length() > 0 && (i1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f11354x;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    public final void c(a aVar) {
        int i10;
        int y3;
        int i11;
        a aVar2;
        int i12;
        String o9;
        int i13 = aVar.f11192c;
        bb bbVar = this.e;
        View view = this.f11348c;
        bi.o oVar = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            oVar.setVisibility(8);
            bbVar.setVisibility(8);
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
            oVar.setVisibility(8);
            bbVar.setVisibility(0);
            ((CheckBoxBase) bbVar.f4422b).f(-1, aVar.f11193f, false);
            return;
        }
        bbVar.setVisibility(8);
        oVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) oVar.getLayoutParams();
        if (aVar.d == 0) {
            y3 = AndroidUtilities.dp(18.0f);
        } else {
            b6 b6Var = this.f11355y;
            if (b6Var != null) {
                TextPaint paint = oVar.getPaint();
                ArrayList arrayList = ((f3) b6Var).f11363a.f11735l3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f11192c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f11192c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f11192c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f7 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f11192c == i11 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    y3 = org.telegram.messenger.f0.y(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                } else {
                    y3 = org.telegram.messenger.f0.y(10.0f, (int) Math.ceil(paint.measureText(a4.a.o(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = oVar.getPaint();
                y3 = org.telegram.messenger.f0.y(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != y3) {
            layoutParams2.width = y3;
            oVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            o9 = "";
        } else {
            o9 = a4.a.o(aVar.d, ".", new StringBuilder());
        }
        oVar.setText(o9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i1 i1Var;
        Canvas canvas2;
        float f7;
        q9 q9Var;
        int dp;
        float f10;
        float f11;
        int i10;
        int dp2;
        a aVar = this.f11354x;
        LinearLayout linearLayout = this.f11347b;
        Paint paint = this.U;
        org.telegram.ui.ActionBar.d6 d6Var = this.f11346a;
        i1 i1Var2 = this.f11349f;
        if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.xk, d6Var));
            int c10 = p8.c(this.f11354x);
            int d = p8.d(this.f11354x);
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
            i1Var = i1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f12, f12, paint);
            canvas2 = canvas;
        } else {
            i1Var = i1Var2;
            if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    dm0 dm0Var = new dm0(this);
                    this.J = dm0Var;
                    dm0Var.a(null, null, null, this.f11346a, 1);
                    p8.a(this.J, d6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.b(canvas2, rectF, floor, floor, floor, 1.0f);
                this.J.e(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        dm0 dm0Var2 = new dm0(this);
                        this.J = dm0Var2;
                        dm0Var2.a(null, null, null, this.f11346a, 1);
                        p8.a(this.J, d6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = i1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = i1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + i1Var.getPaddingLeft() + left);
                            int left2 = i1Var.getLeft() + linearLayout.getLeft();
                            f7 = Math.max(f7, layout.getLineRight(i11) + i1Var.getPaddingLeft() + left2);
                        }
                    } else if (i1Var.getHint() != null) {
                        float measureText = i1Var.getPaint().measureText(i1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    i1 i1Var3 = this.h;
                    if (i1Var3.getVisibility() == 0) {
                        Layout layout2 = i1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = i1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + i1Var3.getPaddingLeft() + left3);
                                int left4 = i1Var3.getLeft();
                                f7 = Math.max(f7, layout2.getLineRight(i12) + i1Var3.getPaddingLeft() + left4);
                            }
                        } else if (i1Var3.getHint() != null) {
                            float measureText2 = i1Var3.getPaint().measureText(i1Var3.getHint().toString());
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
                        this.J.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
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
        if (this.T) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = i1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + i1Var.getPaddingTop() + getPaddingTop());
                    int left5 = i1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + i1Var.getPaddingLeft() + left5);
                    int left6 = i1Var.getLeft() + linearLayout.getLeft();
                    f10 = Math.max(f10, layout3.getLineRight(i15) + i1Var.getPaddingLeft() + left6);
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + i1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                paint.setColor(org.telegram.ui.ActionBar.h6.l1(0.05f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(width4 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(2.0f), f10 + AndroidUtilities.dp(4.0f), f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        b6 b6Var = this.f11355y;
        if (b6Var != null) {
            q9Var = ((f3) b6Var).f11363a.getTextSelectionHelper();
        } else {
            q9Var = null;
        }
        if (q9Var != null) {
            ArrayList arrayList = this.f11351r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                ba baVar = (ba) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(baVar.getX(), baVar.getY());
                q9Var.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.L == null) {
            this.L = new vi0(this);
        }
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        float B = org.telegram.messenger.f0.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        this.L.a(canvas2, this.M, org.telegram.messenger.f0.B(16.0f, getWidth(), dp), B, v02, ((TL_iv.pageBlockBlockquote) this.f11354x.f11191b).collapsed, l());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.L != null) {
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
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f11354x.f11191b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        b6 b6Var = this.f11355y;
                        if (b6Var != null) {
                            x3 x3Var = ((f3) b6Var).f11363a;
                            i2 i2Var = x3Var.J3;
                            if (i2Var != null) {
                                i2Var.g();
                            }
                            x3Var.f11728h3.onContentChanged();
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

    @Override
    public final void e() {
        this.f11349f.t();
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.t();
        }
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f11346a;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
        }
        dm0 dm0Var = this.J;
        if (dm0Var != null) {
            p8.a(dm0Var, d6Var);
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        i1 i1Var = this.f11349f;
        Layout layout2 = i1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f11347b;
            arrayList.add(new e5(layout2, i1Var.getPaddingLeft() + i1Var.getLeft() + linearLayout.getLeft(), i1Var.getPaddingTop() + i1Var.getTop() + linearLayout.getTop(), 1));
        }
        i1 i1Var2 = this.h;
        if (i1Var2.getVisibility() == 0 && (layout = i1Var2.getLayout()) != null) {
            arrayList.add(new e5(layout, i1Var2.getPaddingLeft() + i1Var2.getLeft(), i1Var2.getPaddingTop() + i1Var2.getTop(), 2));
        }
    }

    public final void g(ii.a r25, ii.b6 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ii.e6.g(ii.a, ii.b6, boolean):void");
    }

    public i1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public i1 getEditText() {
        return this.f11349f;
    }

    public a getRow() {
        return this.f11354x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f11349f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        vi0 vi0Var;
        int dp;
        boolean z10;
        if (l()) {
            i1 i1Var = this.h;
            if (i1Var.getVisibility() == 0 && (layout = i1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new vi0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f11347b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + i1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + i1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + i1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.L.getClass();
                float B = org.telegram.messenger.f0.B(16.0f, i10, dp2) - org.telegram.messenger.f0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + vi0Var.f29157c);
                this.L.getClass();
                int i12 = i11 - dp2;
                float dp3 = i12 - AndroidUtilities.dp(17.66f);
                float f7 = i12;
                if (lineRight > B) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = (lineBottom <= dp3 || lineTop >= f7) ? false : false;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + dp) + dp2) - i11));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.f11354x;
        if (aVar != null) {
            j(aVar.f11191b);
        }
        i1 i1Var = this.h;
        if (i1Var.getVisibility() != 0) {
            i1Var.setVisibility(0);
            requestLayout();
        }
        i1Var.r();
        i1Var.setSelection(i1Var.length());
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f11349f.getLayout()) == null || layout.getLineCount() <= 3) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        if (this.h.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        a aVar = this.f11354x;
        if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        H();
        i1 i1Var = this.h;
        if (i1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f11347b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        i1Var.layout(paddingLeft, measuredHeight, i1Var.getMeasuredWidth() + paddingLeft, i1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        i1 i1Var = this.h;
        if (i1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f11347b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        i1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + i1Var.getMeasuredHeight() + measuredHeight;
        int h = h(size, paddingBottom);
        this.O = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f11349f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            vi0 vi0Var = this.L;
            if (vi0Var != null) {
                if (drawable != vi0Var.f29156b && drawable != vi0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f11354x;
        if (aVar != null && p(aVar.f11191b)) {
            TL_iv.PageBlock pageBlock = this.f11354x.f11191b;
            TL_iv.RichText f7 = g6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
            }
        }
    }

    public final void x() {
        a aVar = this.f11354x;
        if (aVar != null) {
            d(aVar.f11191b, this.f11349f.getText());
        }
    }
}
