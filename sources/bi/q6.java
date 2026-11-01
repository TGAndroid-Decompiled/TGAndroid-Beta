package bi;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hj;
import org.telegram.messenger.uz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.uh0;
public final class q6 extends FrameLayout implements org.telegram.ui.ActionBar.k6, j9 {
    public static final int f3299a0 = 0;
    public n6 D;
    public boolean E;
    public boolean F;
    public r2 G;
    public String H;
    public int I;
    public el0 J;
    public Drawable K;
    public e0.h L;
    public final RectF M;
    public boolean N;
    public int O;
    public m6 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final org.telegram.ui.ActionBar.p6 f3300a;
    public final LinearLayout f3301b;
    public final View f3302c;
    public final j6 d;
    public final t0 e;
    public final n1 f3303f;
    public final n1 h;
    public boolean f3304n;
    public final ArrayList f3305r;
    public LinearLayout f3306s;
    public TextView f3307w;
    public ImageView f3308x;
    public a f3309y;

    public q6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f3305r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.f3300a = p6Var;
        setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3301b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.f3302c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        j6 j6Var = new j6(this, context);
        this.d = j6Var;
        j6Var.setGravity(8388627);
        j6Var.setPaddingRelative(org.telegram.messenger.i0.L(6.0f), 0, 0, 0);
        j6Var.setSingleLine(true);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTextSize(1, 16.0f);
        linearLayout.addView(j6Var, w7.b6.o(18, -2));
        t0 t0Var = new t0(context, p6Var);
        this.e = t0Var;
        t0Var.setVisibility(8);
        t0Var.setOnClickListener(new e6(this, 0));
        linearLayout.addView(t0Var, w7.b6.o(18, -2));
        n1 n1Var = new n1(context, p6Var);
        this.f3303f = n1Var;
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        n1Var.setListener(new k6(this));
        n1Var.setDelegate(new kt(this) {
            public final q6 f3020b;

            {
                this.f3020b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f3020b;
                        if (!q6Var.S && q6Var.f3309y != null) {
                            q6Var.K();
                            q6.d(q6Var.f3309y.f2818b, q6Var.f3303f.getText());
                            n6 n6Var = q6Var.D;
                            if (n6Var != null) {
                                d4.R1(((m3) n6Var).f3203a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q6 q6Var2 = this.f3020b;
                        if (q6Var2.f3309y != null) {
                            q6Var2.w();
                            n6 n6Var2 = q6Var2.D;
                            if (n6Var2 != null) {
                                d4.R1(((m3) n6Var2).f3203a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        n1Var.setOnFocusChangeListener(new g6(this, 0));
        linearLayout.addView(n1Var, w7.b6.l(1.0f, 0, -2));
        addView(linearLayout, w7.b6.e(-1, -2, 51));
        n1 n1Var2 = new n1(context, p6Var);
        this.h = n1Var2;
        n1Var2.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        n1Var2.setAllowNewlines(false);
        n1Var2.setInputType(147457);
        n1Var2.setListener(new l6(this));
        n1Var2.setDelegate(new kt(this) {
            public final q6 f3020b;

            {
                this.f3020b = this;
            }

            @Override
            public final void m() {
                switch (r2) {
                    case 0:
                        q6 q6Var = this.f3020b;
                        if (!q6Var.S && q6Var.f3309y != null) {
                            q6Var.K();
                            q6.d(q6Var.f3309y.f2818b, q6Var.f3303f.getText());
                            n6 n6Var = q6Var.D;
                            if (n6Var != null) {
                                d4.R1(((m3) n6Var).f3203a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q6 q6Var2 = this.f3020b;
                        if (q6Var2.f3309y != null) {
                            q6Var2.w();
                            n6 n6Var2 = q6Var2.D;
                            if (n6Var2 != null) {
                                d4.R1(((m3) n6Var2).f3203a);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        n1Var2.setVisibility(8);
        addView(n1Var2, w7.b6.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return s6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(q6 q6Var, boolean z10) {
        n6 n6Var;
        q6Var.f3303f.setHint(q6Var.getHint());
        if (!z10 && (n6Var = q6Var.D) != null) {
            ((m3) n6Var).f3203a.f2938o3.D(q6Var, null);
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
        pageBlock.text = s6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        int i10;
        a aVar = this.f3309y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.f2818b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            if (aVar.f2829p) {
                i10 = 2131754014;
            } else {
                i10 = 2131754030;
            }
            return dd.L0(i10, null);
        } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return dd.L0(2131754029, null);
        } else {
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return dd.L0(2131754028, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return dd.L0(2131754027, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return dd.L0(2131754026, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return dd.L0(2131754025, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return dd.L0(2131754019, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return dd.L0(2131754016, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return dd.L0(2131754016, null);
            }
            if (!aVar.f2830q) {
                return null;
            }
            return dd.L0(2131754015, null);
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

    public static boolean m(n1 n1Var, int i10, int i11, int i12, int i13) {
        if (n1Var.length() != 0 || i12 < i10 || i12 > n1Var.getWidth() + i10 || i13 < i11 || i13 > n1Var.getHeight() + i11) {
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

    public static p6 r(a aVar, String str) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str != null && aVar != null) {
            String trim = str.trim();
            int i12 = 2;
            if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
                return new p6(new TL_iv.pageBlockDivider(), 0, 0);
            }
            String lowerCase = trim.toLowerCase();
            if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
                return new p6(v(charAt - '0'), aVar.f2819c, aVar.d);
            }
            if (!lowerCase.equals("/code") && !lowerCase.equals("/pre") && !lowerCase.equals("/preformatted")) {
                if (lowerCase.equals("/footer")) {
                    return new p6(new TL_iv.pageBlockFooter(), 0, 0);
                }
                if (!lowerCase.equals("/quote") && !lowerCase.equals("/blockquote")) {
                    if (lowerCase.equals("/pullquote")) {
                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                        pageblockpullquote.caption = new TL_iv.textEmpty();
                        return new p6(pageblockpullquote, 0, 0);
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
                                return new p6(u(i12, i10), 0, 0);
                            }
                        }
                        i10 = 2;
                        return new p6(u(i12, i10), 0, 0);
                    } else {
                        return null;
                    }
                }
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new p6(pageblockblockquote, 0, 0);
            }
            return new p6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static p6 s(a aVar, String str) {
        int length;
        boolean z10;
        char charAt;
        if (aVar != null && str != null && (length = str.length()) >= 2) {
            int i10 = length - 1;
            if (str.charAt(i10) == ' ') {
                TL_iv.PageBlock pageBlock = aVar.f2818b;
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
                        return new p6(v(i11), aVar.f2819c, aVar.d);
                    }
                    return null;
                } else if (z11) {
                    if (aVar.f2819c == 0 && length == 2) {
                        char charAt2 = str.charAt(0);
                        if (charAt2 != '-' && charAt2 != '*' && charAt2 != '+') {
                            if (charAt2 == '|') {
                                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                pageblockblockquote.caption = new TL_iv.textEmpty();
                                return new p6(pageblockblockquote, 0, 0);
                            }
                        } else {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            e(pageblockparagraph, "");
                            return new p6(pageblockparagraph, 1, 0);
                        }
                    }
                    if (aVar.f2819c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
                        return t(false);
                    }
                    if (aVar.f2819c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt3 = str.charAt(1);
                        if (charAt3 == ' ') {
                            return t(false);
                        }
                        if (charAt3 == 'x' || charAt3 == 'X') {
                            return t(true);
                        }
                    }
                    if (aVar.f2819c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        e(pageblockparagraph2, "");
                        return new p6(pageblockparagraph2, 1, 1);
                    } else if (aVar.f2819c == 0 && length == 4) {
                        char charAt4 = str.charAt(0);
                        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
                            return new p6(new TL_iv.pageBlockDivider(), 0, 0);
                        }
                        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
                            return new p6(new TL_iv.pageBlockPreformatted(), 0, 0);
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

    public static p6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new p6(pageblockparagraph, 1, 0, true, z10);
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
                pagetablerow.cells.add(w6.f());
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

    public static boolean y(n1 n1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = n1Var.getLayout();
        if (layout != null && n1Var.length() != 0) {
            int paddingLeft = i12 - (n1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (n1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.i0.L(24.0f);
                int max = Math.max(0, (n1Var.getWidth() - n1Var.getPaddingLeft()) - n1Var.getPaddingRight());
                float f7 = L;
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
        return s6.l(pageBlock.text);
    }

    public final void B() {
        this.f3303f.N();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.f3309y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                r2 r2Var = new r2(this, 1);
                this.G = r2Var;
                postDelayed(r2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f3303f.getText();
        if (text != null) {
            for (di.e eVar : (di.e[]) text.getSpans(0, text.length(), di.e.class)) {
                text.removeSpan(eVar);
            }
        }
        this.H = null;
    }

    public final void D(p0 p0Var) {
        if (this.D != null && this.f3309y != null && p0Var != null) {
            List<String> list = p0Var.f3274c;
            if (!list.isEmpty()) {
                for (String str : list) {
                    int q6 = q(str);
                    if (q6 != 0) {
                        ((m3) this.D).c(this.f3309y, q6);
                        return;
                    }
                    p6 r10 = r(this.f3309y, str);
                    if (r10 == null) {
                        r10 = s(this.f3309y, sc.e.A(str, " "));
                        continue;
                    }
                    if (r10 != null) {
                        ((m3) this.D).d(this.f3309y, r10.f3286a, r10.f3287b, r10.f3288c, r10.d, r10.e);
                        return;
                    }
                }
            }
        }
    }

    public final void E(Editable editable) {
        org.telegram.ui.Components.o5[] o5VarArr;
        a aVar = this.f3309y;
        if (aVar != null && d4.F3(aVar.f2818b) && c3.i0.t(editable)) {
            n1 n1Var = this.f3303f;
            Paint.FontMetricsInt fontMetricsInt = n1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((n1Var.getTextSize() * 0.85f) / 1.2f));
            for (org.telegram.messenger.h6 h6Var : (org.telegram.messenger.h6[]) editable.getSpans(0, editable.length(), org.telegram.messenger.h6.class)) {
                h6Var.f16025b = 0.85f;
            }
            for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.o5.class)) {
                o5Var.replaceFontMetrics(fontMetricsInt);
                o5Var.setSize(max);
            }
        }
    }

    public final void F() {
        n6 n6Var;
        int i10;
        int i11;
        a aVar = this.f3309y;
        if (aVar != null && aVar.f2819c > 0 && (n6Var = this.D) != null) {
            int b10 = ((m3) n6Var).b(aVar);
            int a2 = ((m3) this.D).a(this.f3309y);
            a aVar2 = this.f3309y;
            if (aVar2.f2827n) {
                if (aVar2.f2825l <= 0) {
                    b10 = 0;
                } else {
                    b10 = org.telegram.messenger.i0.L(i0.a.e(i11, 1, 16, 10));
                }
            }
            a aVar3 = this.f3309y;
            if (aVar3.f2828o) {
                if (aVar3.f2826m <= 0) {
                    a2 = 0;
                } else {
                    a2 = org.telegram.messenger.i0.L(i0.a.e(i10, 1, 16, 10));
                }
            }
            if (b10 != getPaddingTop() || a2 != getPaddingBottom()) {
                setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
            }
        }
    }

    public final void G() {
        a aVar = this.f3309y;
        n1 n1Var = this.f3303f;
        n1 n1Var2 = this.h;
        if (aVar != null && p(aVar.f2818b) && (n1Var.length() > 0 || n1Var2.length() > 0)) {
            if (n1Var2.getVisibility() != 0) {
                n1Var2.setVisibility(0);
                requestLayout();
            }
        } else if (n1Var2.getVisibility() != 8) {
            if (n1Var2.isFocused()) {
                n1Var.requestFocus();
            }
            n1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        n1 n1Var = this.f3303f;
        if (n1Var.getText() != null) {
            Editable text = n1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.f3309y.f2818b).collapsed || (layout = n1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                m6 m6Var = this.P;
                if (m6Var != null) {
                    text.removeSpan(m6Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new m6(this, 0);
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

    public final void I() {
        this.f3303f.updateColors();
        n1 n1Var = this.h;
        if (n1Var != null) {
            n1Var.updateColors();
        }
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3300a;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        if (this.K != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        el0 el0Var = this.J;
        if (el0Var != null) {
            v7.a5.a(el0Var, p6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z10) {
        float f7;
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.f3306s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f3306s;
        if (linearLayout2 != null && z10) {
            org.telegram.messenger.i0.E2(linearLayout2);
            this.f3306s = null;
        }
        if (this.f3306s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.f3306s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.f3306s;
            int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
            a7.R(linearLayout4, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i10, this.f3300a), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f)), null, a7.N(i10), this.f3300a);
            this.f3306s.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
            addView(this.f3306s, w7.b6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.f3307w = textView;
            textView.setTextSize(1, 12.0f);
            this.f3307w.setGravity(17);
            this.f3306s.addView(this.f3307w, w7.b6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.f3308x = imageView;
            imageView.setImageResource(2131230873);
            this.f3306s.addView(this.f3308x, w7.b6.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            di.s sVar = di.l.f5973a;
            synchronized (sVar.f5985a) {
                try {
                    if (!sVar.f5991s) {
                        sVar.d.execute(new di.m(sVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f3306s.setOnClickListener(new e6(this, 1));
            this.f3306s.setOnLongClickListener(new Object());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, this.f3300a);
        float f10 = 0.75f;
        if (TextUtils.isEmpty(str)) {
            f7 = 0.5f;
        } else {
            f7 = 0.75f;
        }
        org.telegram.ui.ActionBar.t6.r1(f7, w02);
        if (TextUtils.isEmpty(str)) {
            f10 = 0.5f;
        }
        org.telegram.ui.ActionBar.w6 L = a7.L(f10, i11);
        ImageView imageView2 = this.f3308x;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3300a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = L.f21453a;
        float f11 = L.d;
        int Q = a7.Q(i12, -1, 2, f11, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        a7.O(imageView2, 5, i12, -1, 2, f11, p6Var, Q, porterDuffColorFilter).h = mode;
        a7.W(this.f3307w, L, this.f3300a);
        if (TextUtils.isEmpty(str)) {
            this.f3307w.setText(dd.L0(2131754017, null));
        } else {
            this.f3307w.setText(hj.b(str));
        }
        this.f3306s.setVisibility(0);
    }

    public final void K() {
        Typeface typeface;
        a aVar = this.f3309y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            n1 n1Var = this.f3303f;
            if (n1Var.length() > 0 && (n1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        if (z10) {
            typeface = org.telegram.messenger.i0.o();
        } else {
            typeface = null;
        }
        this.d.setTypeface(typeface);
        a aVar2 = this.f3309y;
        if (aVar2 != null && aVar2.d > 0) {
            c(aVar2);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    public final void c(a aVar) {
        int i10;
        int b10;
        int i11;
        a aVar2;
        int i12;
        String p5;
        int i13 = aVar.f2819c;
        t0 t0Var = this.e;
        View view = this.f3302c;
        j6 j6Var = this.d;
        if (i13 <= 0) {
            view.setVisibility(8);
            j6Var.setVisibility(8);
            t0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.i0.L(24.0f) * (i13 - 1);
        view.setLayoutParams(layoutParams);
        if (i13 > 1) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (aVar.e) {
            j6Var.setVisibility(8);
            t0Var.setVisibility(0);
            ((CheckBoxBase) t0Var.f3356b).f(-1, aVar.f2820f, false);
            return;
        }
        t0Var.setVisibility(8);
        j6Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) j6Var.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.i0.L(18.0f);
        } else {
            n6 n6Var = this.D;
            if (n6Var != null) {
                TextPaint paint = j6Var.getPaint();
                ArrayList arrayList = ((m3) n6Var).f3203a.f2946s3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf >= 0 && (i11 = aVar.f2819c) > 0 && aVar.d > 0) {
                    int i14 = indexOf;
                    while (i14 > 0) {
                        a aVar3 = (a) arrayList.get(i14 - 1);
                        int i15 = aVar3.f2819c;
                        if (i15 < i11 || (i15 == i11 && aVar3.d <= 0)) {
                            break;
                        }
                        i14--;
                    }
                    int i16 = indexOf + 1;
                    while (i16 < arrayList.size() && (i12 = (aVar2 = (a) arrayList.get(i16)).f2819c) >= i11 && (i12 != i11 || aVar2.d > 0)) {
                        i16++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.i0.o());
                    float f7 = 0.0f;
                    while (i14 < i16) {
                        a aVar4 = (a) arrayList.get(i14);
                        if (aVar4.f2819c == i11 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i14++;
                    }
                    b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(f7), org.telegram.messenger.i0.L(28.0f));
                } else {
                    b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(paint.measureText(a1.g.p(new StringBuilder(), aVar.d, "."))), org.telegram.messenger.i0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.i0.L(28.0f);
                TextPaint paint3 = j6Var.getPaint();
                b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            j6Var.setLayoutParams(layoutParams2);
        }
        if (aVar.d == 0) {
            p5 = "";
        } else {
            p5 = a1.g.p(new StringBuilder(), aVar.d, ".");
        }
        j6Var.setText(p5);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n1 n1Var;
        Canvas canvas2;
        float f7;
        k9 k9Var;
        int L;
        float f10;
        float f11;
        int i10;
        int L2;
        a aVar = this.f3309y;
        LinearLayout linearLayout = this.f3301b;
        Paint paint = this.W;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3300a;
        n1 n1Var2 = this.f3303f;
        if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockPreformatted)) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ll, p6Var));
            int c10 = v7.a5.c(this.f3309y);
            int d = v7.a5.d(this.f3309y);
            int width = getWidth();
            if (c10 <= 0 && d <= 0) {
                i10 = 0;
            } else {
                int L3 = org.telegram.messenger.i0.L(16.0f) + c10;
                int L4 = org.telegram.messenger.i0.L(16.0f) + d;
                if (dd.X) {
                    i10 = L4;
                } else {
                    i10 = L3;
                }
                int width2 = getWidth();
                if (!dd.X) {
                    L3 = L4;
                }
                width = width2 - L3;
            }
            if (i10 <= 0 && width >= getWidth()) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.i0.L(8.0f);
            }
            float f12 = L2;
            n1Var = n1Var2;
            canvas.drawRoundRect(i10, org.telegram.messenger.i0.L(7.0f), width, getHeight() - org.telegram.messenger.i0.L(7.0f), f12, f12, paint);
            canvas2 = canvas;
        } else {
            n1Var = n1Var2;
            if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockBlockquote)) {
                if (this.J == null) {
                    el0 el0Var = new el0(this);
                    this.J = el0Var;
                    el0Var.a(null, null, null, this.f3300a, 1);
                    v7.a5.a(this.J, p6Var);
                }
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), getWidth() - org.telegram.messenger.i0.L(16.0f), getHeight() - org.telegram.messenger.i0.L(8.0f));
                float floor = (float) Math.floor(uz.Y0 / 3.0f);
                canvas2 = canvas;
                this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                this.J.f(canvas2, rectF, 1.0f);
            } else {
                canvas2 = canvas;
                if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        el0 el0Var2 = new el0(this);
                        this.J = el0Var2;
                        el0Var2.a(null, null, null, this.f3300a, 1);
                        v7.a5.a(this.J, p6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(2131231965).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = n1Var.getLayout();
                    float width3 = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            int left = n1Var.getLeft() + linearLayout.getLeft();
                            width3 = Math.min(width3, layout.getLineLeft(i11) + n1Var.getPaddingLeft() + left);
                            int left2 = n1Var.getLeft() + linearLayout.getLeft();
                            f7 = Math.max(f7, layout.getLineRight(i11) + n1Var.getPaddingLeft() + left2);
                        }
                    } else if (n1Var.getHint() != null) {
                        float measureText = n1Var.getPaint().measureText(n1Var.getHint().toString());
                        width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    n1 n1Var3 = this.h;
                    if (n1Var3.getVisibility() == 0) {
                        Layout layout2 = n1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                int left3 = n1Var3.getLeft();
                                width3 = Math.min(width3, layout2.getLineLeft(i12) + n1Var3.getPaddingLeft() + left3);
                                int left4 = n1Var3.getLeft();
                                f7 = Math.max(f7, layout2.getLineRight(i12) + n1Var3.getPaddingLeft() + left4);
                            }
                        } else if (n1Var3.getHint() != null) {
                            float measureText2 = n1Var3.getPaint().measureText(n1Var3.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                            f7 = Math.max(f7, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                        }
                    }
                    if (width3 < f7) {
                        float L5 = width3 - org.telegram.messenger.i0.L(30.0f);
                        float L6 = org.telegram.messenger.i0.L(30.0f) + f7;
                        float floor2 = (float) Math.floor(uz.Y0 / 2.0f);
                        int L7 = org.telegram.messenger.i0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.i0.L(8.0f);
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        rectF2.set(L5, L7, L6, height);
                        this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                        canvas2.save();
                        int i13 = (int) L5;
                        this.K.setBounds(org.telegram.messenger.i0.L(8.0f) + i13, org.telegram.messenger.i0.L(7.0f) + L7, this.K.getIntrinsicWidth() + org.telegram.messenger.i0.L(8.0f) + i13, this.K.getIntrinsicHeight() + org.telegram.messenger.i0.L(7.0f) + L7);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) L6;
                        this.K.setBounds((i14 - org.telegram.messenger.i0.L(8.0f)) - this.K.getIntrinsicWidth(), (height - org.telegram.messenger.i0.L(7.0f)) - this.K.getIntrinsicHeight(), i14 - org.telegram.messenger.i0.L(8.0f), height - org.telegram.messenger.i0.L(7.0f));
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
            Layout layout3 = n1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + n1Var.getPaddingTop() + getPaddingTop());
                    int left5 = n1Var.getLeft() + linearLayout.getLeft();
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + n1Var.getPaddingLeft() + left5);
                    int left6 = n1Var.getLeft() + linearLayout.getLeft();
                    f10 = Math.max(f10, layout3.getLineRight(i15) + n1Var.getPaddingLeft() + left6);
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + n1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float L8 = width4 - org.telegram.messenger.i0.L(4.0f);
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L8, height2 - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f) + f10, f11 + org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        n6 n6Var = this.D;
        if (n6Var != null) {
            k9Var = ((m3) n6Var).f3203a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            ArrayList arrayList = this.f3305r;
            arrayList.clear();
            h(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u9 u9Var = (u9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(u9Var.getX(), u9Var.getY());
                k9Var.Z(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (!o()) {
            return;
        }
        if (this.L == null) {
            this.L = new e0.h(this);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
        float z10 = org.telegram.messenger.m5.z(8.0f, getHeight(), org.telegram.messenger.i0.L(3.333f));
        Canvas canvas4 = canvas2;
        this.L.d(canvas4, this.M, org.telegram.messenger.m5.z(16.0f, getWidth(), L), z10, w02, ((TL_iv.pageBlockBlockquote) this.f3309y.f2818b).collapsed, l());
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
                            this.L.g(false);
                            return true;
                        }
                    } else if (this.N) {
                        this.L.g(contains);
                        return true;
                    }
                } else if (this.N) {
                    this.N = false;
                    this.L.g(false);
                    if (contains && o()) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.f3309y.f2818b;
                        pageblockblockquote.collapsed = !pageblockblockquote.collapsed;
                        H();
                        invalidate();
                        n6 n6Var = this.D;
                        if (n6Var != null) {
                            d4 d4Var = ((m3) n6Var).f3203a;
                            o2 o2Var = d4Var.Q3;
                            if (o2Var != null) {
                                o2Var.g();
                            }
                            d4Var.f2938o3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.N = true;
                this.L.g(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f(bi.a r27, bi.n6 r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: bi.q6.f(bi.a, bi.n6, boolean):void");
    }

    public final int g(int i10, int i11) {
        Layout layout;
        e0.h hVar;
        int L;
        boolean z10;
        if (l()) {
            n1 n1Var = this.h;
            if (n1Var.getVisibility() == 0 && (layout = n1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new e0.h(this);
                }
                boolean z11 = true;
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.f3301b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + n1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + n1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + n1Var.getPaddingTop() + measuredHeight;
                int L2 = org.telegram.messenger.i0.L(3.333f);
                this.L.getClass();
                float z12 = org.telegram.messenger.m5.z(16.0f, i10, L2) - org.telegram.messenger.m5.D(3.333f, 2, org.telegram.messenger.i0.L(23.66f) + hVar.f6019a);
                this.L.getClass();
                int i12 = i11 - L2;
                float L3 = i12 - org.telegram.messenger.i0.L(17.66f);
                float f7 = i12;
                if (lineRight > z12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (lineBottom <= L3 || lineTop >= f7) {
                    z11 = false;
                }
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.i0.L(4.0f)) + L) + L2) - i11));
                }
            }
        }
        return 0;
    }

    public n1 getAuthorEditText() {
        return this.h;
    }

    public n1 getEditText() {
        return this.f3303f;
    }

    public a getRow() {
        return this.f3309y;
    }

    public org.telegram.ui.ActionBar.r4 getStyleDelegate() {
        return this.f3303f;
    }

    @Override
    public final void h(ArrayList arrayList) {
        Layout layout;
        n1 n1Var = this.f3303f;
        Layout layout2 = n1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.f3301b;
            arrayList.add(new o5(layout2, n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft(), n1Var.getPaddingTop() + n1Var.getTop() + linearLayout.getTop(), 1));
        }
        n1 n1Var2 = this.h;
        if (n1Var2.getVisibility() == 0 && (layout = n1Var2.getLayout()) != null) {
            arrayList.add(new o5(layout, n1Var2.getPaddingLeft() + n1Var2.getLeft(), n1Var2.getPaddingTop() + n1Var2.getTop(), 2));
        }
    }

    public final void i() {
        a aVar = this.f3309y;
        if (aVar != null) {
            j(aVar.f2818b);
        }
        n1 n1Var = this.h;
        if (n1Var.getVisibility() != 0) {
            n1Var.setVisibility(0);
            requestLayout();
        }
        n1Var.N();
        n1Var.setSelection(n1Var.length());
    }

    public final boolean l() {
        Layout layout;
        if (!o() || (layout = this.f3303f.getLayout()) == null || layout.getLineCount() <= 3) {
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
        a aVar = this.f3309y;
        if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockBlockquote)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        H();
        n1 n1Var = this.h;
        if (n1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.f3301b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        n1Var.layout(paddingLeft, measuredHeight, n1Var.getMeasuredWidth() + paddingLeft, n1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        n1 n1Var = this.h;
        if (n1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.f3301b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        n1Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = linearLayout.getMeasuredHeight() + getPaddingTop();
        int paddingBottom = getPaddingBottom() + n1Var.getMeasuredHeight() + measuredHeight;
        int g10 = g(size, paddingBottom);
        this.O = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z10) {
        this.f3303f.setLocked(z10);
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
            I();
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f3300a));
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            e0.h hVar = this.L;
            if (hVar != null) {
                if (drawable != ((org.telegram.ui.Components.e6) hVar.e) && drawable != ((uh0) hVar.f6022f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void w() {
        a aVar = this.f3309y;
        if (aVar != null && p(aVar.f2818b)) {
            TL_iv.PageBlock pageBlock = this.f3309y.f2818b;
            TL_iv.RichText f7 = s6.f(this.h.getText());
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
            }
        }
    }

    public final void x() {
        a aVar = this.f3309y;
        if (aVar != null) {
            d(aVar.f2818b, this.f3303f.getText());
        }
    }
}
