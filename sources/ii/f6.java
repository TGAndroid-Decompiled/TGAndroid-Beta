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
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ym0;
import v7.n8;
public final class f6 extends FrameLayout implements org.telegram.ui.ActionBar.x5, n9 {
    public static final int V = 0;
    public boolean E;
    public boolean F;
    public l2 G;
    public String H;
    public int I;
    public ym0 J;
    public Drawable K;
    public qj0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public b6 P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public final Paint U;
    public final org.telegram.ui.ActionBar.d6 f12414a;
    public final LinearLayout f12415b;
    public final View f12416c;
    public final bi.o d;
    public final bb f12417e;
    public final i1 f12418f;
    public final i1 h;
    public boolean f12419n;
    public final ArrayList f12420r;
    public LinearLayout f12421s;
    public TextView v;
    public ImageView f12422w;
    public a f12423x;
    public c6 f12424y;

    public f6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f12420r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.U = new Paint(1);
        this.f12414a = d6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12415b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f12416c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        bi.o oVar = new bi.o(this, context);
        this.d = oVar;
        oVar.setGravity(8388627);
        oVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        oVar.setSingleLine(true);
        oVar.setIncludeFontPadding(false);
        oVar.setTextSize(1, 16.0f);
        linearLayout.addView(oVar, w7.x5.n(18, -2));
        bb bbVar = new bb(context, d6Var);
        this.f12417e = bbVar;
        bbVar.setVisibility(8);
        bbVar.setOnClickListener(new v5(this, 0));
        linearLayout.addView(bbVar, w7.x5.n(18, -2));
        i1 i1Var = new i1(context, d6Var);
        this.f12418f = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        i1Var.setListener(new z5(this));
        i1Var.setDelegate(new qu(this) {
            public final f6 f12788b;

            {
                this.f12788b = this;
            }

            @Override
            public final void i() {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f12788b;
                        if (!f6Var.S && f6Var.f12423x != null) {
                            f6Var.J();
                            f6.d(f6Var.f12423x.f12233b, f6Var.f12418f.getText());
                            c6 c6Var = f6Var.f12424y;
                            if (c6Var != null) {
                                x3.P1(((f3) c6Var).f12410a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f6 f6Var2 = this.f12788b;
                        if (f6Var2.f12423x != null) {
                            f6Var2.w();
                            c6 c6Var2 = f6Var2.f12424y;
                            if (c6Var2 != null) {
                                x3.P1(((f3) c6Var2).f12410a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        i1Var.setOnFocusChangeListener(new x5(this, 0));
        linearLayout.addView(i1Var, w7.x5.l(1.0f, 0, -2));
        addView(linearLayout, w7.x5.e(-1, -2, 51));
        i1 i1Var2 = new i1(context, d6Var);
        this.h = i1Var2;
        i1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var2.setAllowNewlines(false);
        i1Var2.setInputType(147457);
        i1Var2.setListener(new a6(this));
        i1Var2.setDelegate(new qu(this) {
            public final f6 f12788b;

            {
                this.f12788b = this;
            }

            @Override
            public final void i() {
                switch (r2) {
                    case 0:
                        f6 f6Var = this.f12788b;
                        if (!f6Var.S && f6Var.f12423x != null) {
                            f6Var.J();
                            f6.d(f6Var.f12423x.f12233b, f6Var.f12418f.getText());
                            c6 c6Var = f6Var.f12424y;
                            if (c6Var != null) {
                                x3.P1(((f3) c6Var).f12410a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f6 f6Var2 = this.f12788b;
                        if (f6Var2.f12423x != null) {
                            f6Var2.w();
                            c6 c6Var2 = f6Var2.f12424y;
                            if (c6Var2 != null) {
                                x3.P1(((f3) c6Var2).f12410a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        i1Var2.setVisibility(8);
        addView(i1Var2, w7.x5.e(-1, -2, 51));
        e();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return h6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(f6 f6Var, boolean z10) {
        c6 c6Var;
        f6Var.f12418f.setHint(f6Var.getHint());
        if (!z10 && (c6Var = f6Var.f12424y) != null) {
            ((f3) c6Var).f12410a.f12808f3.l(f6Var, null);
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
        pageBlock.text = h6.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f12423x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f12233b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f12245p) {
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
            if (!aVar.f12246q) {
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

    public static e6 r(a aVar, String str) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new e6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new e6(v(charAt - '0'), aVar.f12234c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new e6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new e6(pageblockpullquote, 0, 0);
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
                                return new e6(u(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new e6(u(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new e6(pageblockblockquote, 0, 0);
            }
            return new e6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static e6 s(a aVar, String str) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f12233b;
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
                        return new e6(v(i11), aVar.f12234c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f12234c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new e6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f(pageblockparagraph, "");
                            return new e6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f12234c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f12234c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f12234c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        f(pageblockparagraph2, "");
                        return new e6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f12234c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new e6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new e6(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static e6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new e6(pageblockparagraph, 1, 0, true, z10);
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
                pagetablerow.cells.add(j6.f());
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
        return h6.l(pageBlock.text);
    }

    public final void B() {
        this.f12418f.r();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f12423x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12233b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                l2 l2Var = new l2(this, 1);
                this.G = l2Var;
                postDelayed(l2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f12418f.getText();
        if (text != null) {
            for (li.d dVar : (li.d[]) text.getSpans(0, text.length(), li.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.H = null;
    }

    public final void D(o0 o0Var) {
        if (this.f12424y != null && this.f12423x != null && o0Var != null) {
            List<String> list = o0Var.f12595c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q6 = q(str);
                    if (q6 != 0) {
                        ((f3) this.f12424y).c(this.f12423x, q6);
                        return;
                    }
                    e6 r10 = r(this.f12423x, str);
                    if (r10 == null) {
                        r10 = s(this.f12423x, sc.v.v(str, " "));
                        continue;
                    }
                    if (r10 != null) {
                        ((f3) this.f12424y).d(this.f12423x, r10.f12398a, r10.f12399b, r10.f12400c, r10.d, r10.f12401e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.b6[] b6VarArr;
        a aVar = this.f12423x;
        if (aVar != null && x3.D3(aVar.f12233b) && com.google.android.gms.internal.vision.e2.t(editable)) {
            i1 i1Var = this.f12418f;
            Paint.FontMetricsInt fontMetricsInt = i1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((i1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.b6 b6Var : (org.telegram.ui.Components.b6[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.b6.class)) {
                b6Var.replaceFontMetrics(fontMetricsInt);
                b6Var.setSize(max);
            }
        }
    }

    public final void F() {
        c6 c6Var;
        int i10;
        int i11;
        a aVar = this.f12423x;
        if (aVar != null && aVar.f12234c > 0 && (c6Var = this.f12424y) != null) {
            int b10 = ((f3) c6Var).b(aVar);
            int a2 = ((f3) this.f12424y).a(this.f12423x);
            a aVar2 = this.f12423x;
            if (aVar2.f12243n) {
                if (aVar2.f12241l <= 0) {
                    b10 = 0;
                } else {
                    b10 = AndroidUtilities.dp(hg.c.f(i11, 1, 16, 10));
                }
            }
            a aVar3 = this.f12423x;
            if (aVar3.f12244o) {
                if (aVar3.f12242m <= 0) {
                    a2 = 0;
                } else {
                    a2 = AndroidUtilities.dp(hg.c.f(i10, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f12423x;
        i1 i1Var = this.f12418f;
        i1 i1Var2 = this.h;
        if (aVar != null && p(aVar.f12233b) && (i1Var.length() > 0 || i1Var2.length() > 0)) {
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
        i1 i1Var = this.f12418f;
        if (i1Var.getText() != null) {
            Editable text = i1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f12423x.f12233b).collapsed || (layout = i1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                b6 b6Var = this.P;
                if (b6Var != null) {
                    text.removeSpan(b6Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new b6(0, this);
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
            LinearLayout linearLayout = this.f12421s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f12421s;
        if (linearLayout2 != null && z10) {
            AndroidUtilities.removeFromParent(linearLayout2);
            this.f12421s = null;
        }
        if (this.f12421s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f12421s = linearLayout3;
            linearLayout3.setOrientation(0);
            this.f12421s.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, this.f12414a), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.f12421s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.f12421s, w7.x5.a(-2.0f, 0.0f, -15.0f, -5.0f, 0.0f, -2, 53));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.f12421s.addView(this.v, w7.x5.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f12422w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.f12421s.addView(this.f12422w, w7.x5.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            li.q qVar = li.k.f15659a;
            synchronized (qVar.f15671a) {
                try {
                    if (!qVar.f15678s) {
                        qVar.d.execute(new li.l(qVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f12421s.setOnClickListener(new v5(this, 1));
            this.f12421s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f12414a);
        if (TextUtils.isEmpty(str)) {
            f7 = 0.5f;
        } else {
            f7 = 0.75f;
        }
        int m12 = org.telegram.ui.ActionBar.h6.m1(f7, w02);
        this.f12422w.setColorFilter(new PorterDuffColorFilter(m12, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(m12);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.f12421s.setVisibility(0);
    }

    public final void J() {
        Typeface typeface;
        a aVar = this.f12423x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            i1 i1Var = this.f12418f;
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
        a aVar2 = this.f12423x;
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
        int i13 = aVar.f12234c;
        bb bbVar = this.f12417e;
        View view = this.f12416c;
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
        if (aVar.f12235e) {
            oVar.setVisibility(8);
            bbVar.setVisibility(0);
            ((CheckBoxBase) bbVar.f4802b).f(-1, aVar.f12236f, false);
            return;
        }
        bbVar.setVisibility(8);
        oVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) oVar.getLayoutParams();
        if (aVar.d == 0) {
            y3 = AndroidUtilities.dp(18.0f);
        } else {
            c6 c6Var = this.f12424y;
            if (c6Var != null) {
                TextPaint paint = oVar.getPaint();
                ArrayList arrayList = ((f3) c6Var).f12410a.j3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f12234c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f12234c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f12234c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f7 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f12234c == i11 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    y3 = org.telegram.messenger.q.y(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                } else {
                    y3 = org.telegram.messenger.q.y(10.0f, (int) Math.ceil(paint.measureText(a1.g.o(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = oVar.getPaint();
                y3 = org.telegram.messenger.q.y(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != y3) {
            layoutParams2.width = y3;
            oVar.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            o9 = "";
        } else {
            o9 = a1.g.o(aVar.d, ".", new StringBuilder());
        }
        oVar.setText(o9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i1 i1Var;
        Canvas canvas2;
        float f7;
        o9 o9Var;
        int dp;
        float f10;
        float f11;
        int i10;
        int dp2;
        a aVar = this.f12423x;
        LinearLayout linearLayout = this.f12415b;
        Paint paint = this.U;
        org.telegram.ui.ActionBar.d6 d6Var = this.f12414a;
        i1 i1Var2 = this.f12418f;
        if (aVar != null && (aVar.f12233b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.xk, d6Var));
            int c10 = n8.c(this.f12423x);
            int d = n8.d(this.f12423x);
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
            if (aVar != null && (aVar.f12233b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    ym0 ym0Var = new ym0(this);
                    this.J = ym0Var;
                    ym0Var.a(null, null, null, this.f12414a, 1);
                    n8.a(this.J, d6Var);
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.b(canvas2, rectF, floor, floor, floor, 1.0f);
                this.J.e(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f12233b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        ym0 ym0Var2 = new ym0(this);
                        this.J = ym0Var2;
                        ym0Var2.a(null, null, null, this.f12414a, 1);
                        n8.a(this.J, d6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
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
                paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.05f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(width4 - AndroidUtilities.dp(4.0f), height2 - AndroidUtilities.dp(2.0f), f10 + AndroidUtilities.dp(4.0f), f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        c6 c6Var = this.f12424y;
        if (c6Var != null) {
            o9Var = ((f3) c6Var).f12410a.getTextSelectionHelper();
        } else {
            o9Var = null;
        }
        if (o9Var != null) {
            ArrayList arrayList = this.f12420r;
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
        if (!o()) {
            return;
        }
        if (this.L == null) {
            this.L = new qj0(this);
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        float B = org.telegram.messenger.q.B(8.0f, getHeight(), AndroidUtilities.dp(3.333f));
        this.L.a(canvas2, this.M, org.telegram.messenger.q.B(16.0f, getWidth(), dp), B, w02, ((TL_iv.pageBlockBlockquote) this.f12423x.f12233b).collapsed, l());
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
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f12423x.f12233b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        c6 c6Var = this.f12424y;
                        if (c6Var != null) {
                            x3 x3Var = ((f3) c6Var).f12410a;
                            i2 i2Var = x3Var.H3;
                            if (i2Var != null) {
                                i2Var.g();
                            }
                            x3Var.f12808f3.onContentChanged();
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
        this.f12418f.t();
        i1 i1Var = this.h;
        if (i1Var != null) {
            i1Var.t();
        }
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f12414a;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), PorterDuff.Mode.SRC_IN));
        }
        ym0 ym0Var = this.J;
        if (ym0Var != null) {
            n8.a(ym0Var, d6Var);
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        i1 i1Var = this.f12418f;
        Layout layout2 = i1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f12415b;
            arrayList.add(new f5(layout2, i1Var.getPaddingLeft() + i1Var.getLeft() + linearLayout.getLeft(), i1Var.getPaddingTop() + i1Var.getTop() + linearLayout.getTop(), 1));
        }
        i1 i1Var2 = this.h;
        if (i1Var2.getVisibility() == 0 && (layout = i1Var2.getLayout()) != null) {
            arrayList.add(new f5(layout, i1Var2.getPaddingLeft() + i1Var2.getLeft(), i1Var2.getPaddingTop() + i1Var2.getTop(), 2));
        }
    }

    public final void g(ii.a r25, ii.c6 r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ii.f6.g(ii.a, ii.c6, boolean):void");
    }

    public i1 getAuthorEditText() {
        return this.h;
    }

    public int[] getColorKeys() {
        return null;
    }

    public i1 getEditText() {
        return this.f12418f;
    }

    public a getRow() {
        return this.f12423x;
    }

    public org.telegram.ui.ActionBar.u4 getStyleDelegate() {
        return this.f12418f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        qj0 qj0Var;
        int dp;
        boolean z10;
        if (l()) {
            i1 i1Var = this.h;
            if (i1Var.getVisibility() == 0 && (layout = i1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new qj0(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f12415b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + i1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + i1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + i1Var.getPaddingTop() + measuredHeight;
                int dp2 = AndroidUtilities.dp(3.333f);
                this.L.getClass();
                float B = org.telegram.messenger.q.B(16.0f, i10, dp2) - org.telegram.messenger.q.D(3.333f, 2, AndroidUtilities.dp(23.66f) + qj0Var.f30255c);
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

    public final void i() {
        a aVar = this.f12423x;
        if (aVar != null) {
            j(aVar.f12233b);
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
        if (!o() || (layout = this.f12418f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f12423x;
        if (aVar != null && (aVar.f12233b instanceof TL_iv.pageBlockBlockquote)) {
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
        LinearLayout linearLayout = this.f12415b;
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
        LinearLayout linearLayout = this.f12415b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        i1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + i1Var.getMeasuredHeight() + measuredHeight;
        int h = h(size, paddingBottom);
        this.O = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f12418f.setLocked(z10);
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
            qj0 qj0Var = this.L;
            if (qj0Var != null) {
                if (drawable != qj0Var.f30254b && drawable != qj0Var.f30256e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f12423x;
        if (aVar != null && p(aVar.f12233b)) {
            TL_iv.PageBlock pageBlock = this.f12423x.f12233b;
            TL_iv.RichText f7 = h6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
            }
        }
    }

    public final void x() {
        a aVar = this.f12423x;
        if (aVar != null) {
            d(aVar.f12233b, this.f12418f.getText());
        }
    }
}
