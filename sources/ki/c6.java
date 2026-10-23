package ki;

import ai.jc;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tm0;
public final class c6 extends FrameLayout implements org.telegram.ui.ActionBar.b6, n9 {
    public static final int f15236a0 = 0;
    public boolean E;
    public boolean F;
    public k2 G;
    public String H;
    public int I;
    public tm0 J;
    public Drawable K;
    public kj0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public y5 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final org.telegram.ui.ActionBar.g6 f15237a;
    public final LinearLayout f15238b;
    public final View f15239c;
    public final di.n d;
    public final jc e;
    public final h1 f15240f;
    public final h1 h;
    public boolean f15241n;
    public final ArrayList f15242r;
    public LinearLayout f15243s;
    public TextView v;
    public ImageView f15244w;
    public a f15245x;
    public z5 f15246y;

    public c6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15242r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.f15237a = g6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15238b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f15239c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        di.n nVar = new di.n(this, context);
        this.d = nVar;
        nVar.setGravity(8388627);
        nVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        nVar.setSingleLine(true);
        nVar.setIncludeFontPadding(false);
        nVar.setTextSize(1, 16.0f);
        linearLayout.addView(nVar, w7.z5.n(18, -2));
        jc jcVar = new jc(context, g6Var);
        this.e = jcVar;
        jcVar.setVisibility(8);
        jcVar.setOnClickListener(new t5(this, 0));
        linearLayout.addView(jcVar, w7.z5.n(18, -2));
        h1 h1Var = new h1(context, g6Var);
        this.f15240f = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        h1Var.setListener(new w5(this));
        h1Var.setDelegate(new gu(this) {
            public final c6 f15623b;

            {
                this.f15623b = this;
            }

            @Override
            public final void h() {
                switch (r2) {
                    case 0:
                        c6 c6Var = this.f15623b;
                        if (!c6Var.S && c6Var.f15245x != null) {
                            c6Var.J();
                            c6.d(c6Var.f15245x.f15141b, c6Var.f15240f.getText());
                            z5 z5Var = c6Var.f15246y;
                            if (z5Var != null) {
                                w3.U1(((e3) z5Var).f15303a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c6 c6Var2 = this.f15623b;
                        if (c6Var2.f15245x != null) {
                            c6Var2.v();
                            z5 z5Var2 = c6Var2.f15246y;
                            if (z5Var2 != null) {
                                w3.U1(((e3) z5Var2).f15303a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        h1Var.setOnFocusChangeListener(new ah.u0(this, 5));
        linearLayout.addView(h1Var, w7.z5.l(1.0f, 0, -2));
        addView(linearLayout, w7.z5.e(-1, -2, 51));
        h1 h1Var2 = new h1(context, g6Var);
        this.h = h1Var2;
        h1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var2.setAllowNewlines(false);
        h1Var2.setInputType(147457);
        h1Var2.setListener(new x5(this));
        h1Var2.setDelegate(new gu(this) {
            public final c6 f15623b;

            {
                this.f15623b = this;
            }

            @Override
            public final void h() {
                switch (r2) {
                    case 0:
                        c6 c6Var = this.f15623b;
                        if (!c6Var.S && c6Var.f15245x != null) {
                            c6Var.J();
                            c6.d(c6Var.f15245x.f15141b, c6Var.f15240f.getText());
                            z5 z5Var = c6Var.f15246y;
                            if (z5Var != null) {
                                w3.U1(((e3) z5Var).f15303a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        c6 c6Var2 = this.f15623b;
                        if (c6Var2.f15245x != null) {
                            c6Var2.v();
                            z5 z5Var2 = c6Var2.f15246y;
                            if (z5Var2 != null) {
                                w3.U1(((e3) z5Var2).f15303a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        h1Var2.setVisibility(8);
        addView(h1Var2, w7.z5.e(-1, -2, 51));
        H();
    }

    public static void a(c6 c6Var, boolean z10) {
        z5 z5Var;
        c6Var.f15240f.setHint(c6Var.getHint());
        if (!z10 && (z5Var = c6Var.f15246y) != null) {
            ((e3) z5Var).f15303a.f15656i3.C(c6Var, null);
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
        pageBlock.text = e6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f15245x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f15141b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f15152p) {
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
            if (!aVar.f15153q) {
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

    public static boolean l(h1 h1Var, int i10, int i11, int i12, int i13) {
        if (h1Var.length() != 0 || i12 < i10 || i12 > h1Var.getWidth() + i10 || i13 < i11 || i13 > h1Var.getHeight() + i11) {
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

    public static b6 q(String str, a aVar) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new b6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new b6(u(charAt - '0'), aVar.f15142c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new b6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new b6(pageblockpullquote, 0, 0);
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
                                return new b6(t(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new b6(t(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new b6(pageblockblockquote, 0, 0);
            }
            return new b6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static b6 r(String str, a aVar) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f15141b;
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
                        return new b6(u(i11), aVar.f15142c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f15142c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new b6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new b6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f15142c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return s(false);
                    }
                    if (aVar.f15142c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return s(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return s(true);
                        }
                    }
                    if (aVar.f15142c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new b6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f15142c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new b6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new b6(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static b6 s(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new b6(pageblockparagraph, 1, 0, true, z10);
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
                pagetablerow.cells.add(g6.f());
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

    public static boolean x(h1 h1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = h1Var.getLayout();
        if (layout != null && h1Var.length() != 0) {
            int paddingLeft = i12 - (h1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (h1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (h1Var.getWidth() - h1Var.getPaddingLeft()) - h1Var.getPaddingRight());
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
        return e6.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return e6.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f15240f.r();
    }

    public final void B() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f15245x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15141b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                k2 k2Var = new k2(this, 1);
                this.G = k2Var;
                postDelayed(k2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f15240f.getText();
        if (text != null) {
            for (mi.d dVar : (mi.d[]) text.getSpans(0, text.length(), mi.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.H = null;
    }

    public final void C(n0 n0Var) {
        if (this.f15246y != null && this.f15245x != null && n0Var != null) {
            List<String> list = n0Var.f15456c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int p5 = p(str);
                    if (p5 != 0) {
                        ((e3) this.f15246y).c(this.f15245x, p5);
                        return;
                    }
                    b6 q6 = q(str, this.f15245x);
                    if (q6 == null) {
                        q6 = r(si.o0.u(str, " "), this.f15245x);
                        continue;
                    }
                    if (q6 != null) {
                        ((e3) this.f15246y).d(this.f15245x, q6.f15214a, q6.f15215b, q6.f15216c, q6.d, q6.e);
                        return;
                    }
                }
            }
        }
    }

    public final void D(Editable editable) {
        org.telegram.ui.Components.a6[] a6VarArr;
        a aVar = this.f15245x;
        if (aVar != null && w3.I3(aVar.f15141b) && com.google.android.gms.internal.play_billing.k3.s(editable)) {
            h1 h1Var = this.f15240f;
            Paint.FontMetricsInt fontMetricsInt = h1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((h1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.a6 a6Var : (org.telegram.ui.Components.a6[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.a6.class)) {
                a6Var.replaceFontMetrics(fontMetricsInt);
                a6Var.setSize(max);
            }
        }
    }

    public final void E() {
        z5 z5Var;
        int i10;
        int i11;
        a aVar = this.f15245x;
        if (aVar != null && aVar.f15142c > 0 && (z5Var = this.f15246y) != null) {
            int b10 = ((e3) z5Var).b(aVar);
            int a2 = ((e3) this.f15246y).a(this.f15245x);
            a aVar2 = this.f15245x;
            if (aVar2.f15150n) {
                if (aVar2.f15148l <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i11, 1, 16, 10));
                }
            }
            a aVar3 = this.f15245x;
            if (aVar3.f15151o) {
                if (aVar3.f15149m <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(i10, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void F() {
        a aVar = this.f15245x;
        h1 h1Var = this.f15240f;
        h1 h1Var2 = this.h;
        if (aVar != null && o(aVar.f15141b) && (h1Var.length() > 0 || h1Var2.length() > 0)) {
            if (h1Var2.getVisibility() != 0) {
                h1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (h1Var2.getVisibility() != 8) {
            if (h1Var2.isFocused()) {
                h1Var.requestFocus();
            }
            h1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void G() {
        int i10;
        Layout layout;
        int lineStart;
        h1 h1Var = this.f15240f;
        if (h1Var.getText() != null) {
            Editable text = h1Var.getText();
            int i11 = -1;
            if (!n() || !((TL_iv.pageBlockBlockquote) this.f15245x.f15141b).collapsed || (layout = h1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                y5 y5Var = this.P;
                if (y5Var != null) {
                    text.removeSpan(y5Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new y5(this, 0);
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
        this.f15240f.updateColors();
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.updateColors();
        }
        int i10 = k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15237a;
        this.d.setTextColor(k6.w0(i10, g6Var));
        if (this.K != null) {
            int w02 = k6.w0(k6.Oh, g6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        tm0 tm0Var = this.J;
        if (tm0Var != null) {
            w7.i.a(tm0Var, g6Var);
        }
    }

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
        float f7;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f15243s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f15243s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f15243s = null;
        }
        if (this.f15243s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f15243s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f15243s;
            int i10 = k6.f21272i6;
            r6.S(linearLayout4, k6.Z(k6.w0(i10, this.f15237a), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)), null, r6.O(i10), this.f15237a);
            this.f15243s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f15243s, w7.z5.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f15243s.addView(this.v, w7.z5.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f15244w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f15243s.addView(this.f15244w, w7.z5.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            mi.r rVar = mi.k.f17024a;
            synchronized (rVar.f17038a) {
                try {
                    if (!rVar.f17044s) {
                        rVar.d.execute(new mi.l(rVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f15243s.setOnClickListener(new t5(this, 1));
            this.f15243s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = k6.G6;
        int w02 = k6.w0(i11, this.f15237a);
        float f10 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f7 = 0.5f;
        } else {
            f7 = 0.75f;
        }
        k6.o1(f7, w02);
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        }
        n6 M = r6.M(f10, i11);
        r6.u(this.f15244w, M, this.f15237a, PorterDuff.Mode.SRC_IN);
        r6.X(this.v, M, this.f15237a);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f15243s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f15245x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            h1 h1Var = this.f15240f;
            if (h1Var.length() > 0 && (h1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f15245x;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Oh));
    }

    public final void c(a aVar) {
        int i10;
        int b10;
        int i11;
        a aVar2;
        int i12;
        String n10;
        int i13 = aVar.f15142c;
        jc jcVar = this.e;
        View view = this.f15239c;
        di.n nVar = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            nVar.setVisibility(8);
            jcVar.setVisibility(8);
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
            jcVar.setVisibility(0);
            ((CheckBoxBase) jcVar.f1569b).f(-1, aVar.f15143f, false);
            return;
        }
        jcVar.setVisibility(8);
        nVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = AndroidUtilities.dp(18.0f);
        } else {
            z5 z5Var = this.f15246y;
            if (z5Var != null) {
                TextPaint paint = nVar.getPaint();
                ArrayList arrayList = ((e3) z5Var).f15303a.f15663m3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f15142c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f15142c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f15142c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f7 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f15142c == i11 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    b10 = org.telegram.messenger.v0.b(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                } else {
                    b10 = org.telegram.messenger.v0.b(10.0f, (int) Math.ceil(paint.measureText(a1.g.n(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = nVar.getPaint();
                b10 = org.telegram.messenger.v0.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
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
        h1 h1Var;
        Canvas canvas2;
        float f7;
        o9 o9Var;
        int dp;
        float f10;
        float f11;
        int i10;
        int dp2;
        a aVar = this.f15245x;
        LinearLayout linearLayout = this.f15238b;
        Paint paint = this.W;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15237a;
        h1 h1Var2 = this.f15240f;
        if (aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(k6.w0(k6.xk, g6Var));
            int c10 = w7.i.c(this.f15245x);
            int d = w7.i.d(this.f15245x);
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
            h1Var = h1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width, getHeight() - AndroidUtilities.dp(7.0f), f12, f12, paint);
            canvas2 = canvas;
        } else {
            h1Var = h1Var2;
            if (aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    tm0 tm0Var = new tm0(this);
                    this.J = tm0Var;
                    tm0Var.a(null, null, null, this.f15237a, 1);
                    w7.i.a(this.J, g6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.J.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        tm0 tm0Var2 = new tm0(this);
                        this.J = tm0Var2;
                        tm0Var2.a(null, null, null, this.f15237a, 1);
                        w7.i.a(this.J, g6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.Oh, g6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = h1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = h1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + h1Var.getPaddingLeft() + left);
                            int left2 = h1Var.getLeft() + linearLayout.getLeft();
                            f7 = Math.max(f7, layout.getLineRight(i11) + h1Var.getPaddingLeft() + left2);
                        }
                    } else if (h1Var.getHint() != null) {
                        float measureText = h1Var.getPaint().measureText(h1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    h1 h1Var3 = this.h;
                    if (h1Var3.getVisibility() == 0) {
                        Layout layout2 = h1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = h1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + h1Var3.getPaddingLeft() + left3);
                                int left4 = h1Var3.getLeft();
                                f7 = Math.max(f7, layout2.getLineRight(i12) + h1Var3.getPaddingLeft() + left4);
                            }
                        } else if (h1Var3.getHint() != null) {
                            float measureText2 = h1Var3.getPaint().measureText(h1Var3.getHint().toString());
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
            Layout layout3 = h1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + h1Var.getPaddingTop() + getPaddingTop());
                    int left5 = h1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + h1Var.getPaddingLeft() + left5);
                    int left6 = h1Var.getLeft() + linearLayout.getLeft();
                    f10 = Math.max(f10, layout3.getLineRight(i15) + h1Var.getPaddingLeft() + left6);
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + h1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float dp8 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(k6.o1(0.05f, k6.w0(k6.G6, g6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp8, height2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + f10, f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        z5 z5Var = this.f15246y;
        if (z5Var != null) {
            o9Var = ((e3) z5Var).f15303a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            ArrayList arrayList = this.f15242r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                z9 z9Var = (z9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(z9Var.getX(), z9Var.getY());
                o9Var.Z(canvas2, this, i16);
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
        int w02 = k6.w0(k6.Oh, g6Var);
        float B = org.telegram.messenger.v0.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        Canvas canvas4 = canvas2;
        this.L.a(canvas4, this.M, org.telegram.messenger.v0.B(16.0f, getWidth(), dp), B, w02, ((TL_iv.pageBlockBlockquote) this.f15245x.f15141b).collapsed, k());
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
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f15245x.f15141b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        G();
                        invalidate();
                        z5 z5Var = this.f15246y;
                        if (z5Var != null) {
                            w3 w3Var = ((e3) z5Var).f15303a;
                            h2 h2Var = w3Var.K3;
                            if (h2Var != null) {
                                h2Var.g();
                            }
                            w3Var.f15656i3.onContentChanged();
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

    public final void f(ki.a r25, ki.z5 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ki.c6.f(ki.a, ki.z5, boolean):void");
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        h1 h1Var = this.f15240f;
        Layout layout2 = h1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f15238b;
            arrayList.add(new d5(layout2, h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft(), h1Var.getPaddingTop() + h1Var.getTop() + linearLayout.getTop(), 1));
        }
        h1 h1Var2 = this.h;
        if (h1Var2.getVisibility() == 0 && (layout = h1Var2.getLayout()) != null) {
            arrayList.add(new d5(layout, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop(), 2));
        }
    }

    public final int g(int i10, int i11) {
        Layout layout;
        kj0 kj0Var;
        int dp;
        boolean z10;
        if (k()) {
            h1 h1Var = this.h;
            if (h1Var.getVisibility() == 0 && (layout = h1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new kj0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f15238b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + h1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.L.getClass();
                float B = org.telegram.messenger.v0.B(16.0f, i10, dp2) - org.telegram.messenger.v0.D(3.333f, 2, AndroidUtilities.dp(23.66f) + kj0Var.f28051c);
                this.L.getClass();
                int i12 = i11 - dp2;
                float dp3 = i12 - AndroidUtilities.dp(17.66f);
                float f7 = i12;
                if (lineRight > B) {
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

    public h1 getAuthorEditText() {
        return this.h;
    }

    public h1 getEditText() {
        return this.f15240f;
    }

    public a getRow() {
        return this.f15245x;
    }

    public org.telegram.ui.ActionBar.z4 getStyleDelegate() {
        return this.f15240f;
    }

    public final void h() {
        a aVar = this.f15245x;
        if (aVar != null) {
            i(aVar.f15141b);
        }
        h1 h1Var = this.h;
        if (h1Var.getVisibility() != 0) {
            h1Var.setVisibility(0);
            requestLayout();
        }
        h1Var.r();
        h1Var.setSelection(h1Var.length());
    }

    public final boolean k() {
        Layout layout;
        if (!n() || (layout = this.f15240f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f15245x;
        if (aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        G();
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f15238b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        h1Var.layout(paddingLeft, measuredHeight, h1Var.getMeasuredWidth() + paddingLeft, h1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        E();
        int size = View.MeasureSpec.getSize(i10);
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f15238b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + h1Var.getMeasuredHeight() + measuredHeight;
        int g10 = g(size, paddingBottom);
        this.O = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z10) {
        this.f15240f.setLocked(z10);
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
            if (getBackground() instanceof a2) {
                ((a2) getBackground()).a(k6.w0(k6.f21183d6, this.f15237a));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v() {
        a aVar = this.f15245x;
        if (aVar != null && o(aVar.f15141b)) {
            TL_iv.PageBlock pageBlock = this.f15245x.f15141b;
            TL_iv.RichText f7 = e6.f(this.h.getText());
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
                if (drawable != kj0Var.f28050b && drawable != kj0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f15245x;
        if (aVar != null) {
            d(aVar.f15141b, this.f15240f.getText());
        }
    }
}
