package defpackage;

import java.util.regex.Pattern;
public final class dg5 extends x1 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final cg5 a = new tg6();
    public boolean c = false;
    public dd d = new dd((byte) 1);

    public dg5(Pattern pattern) {
        this.b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        dd ddVar = this.d;
        StringBuilder sb = (StringBuilder) ddVar.c;
        if (ddVar.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        ddVar.b++;
        Pattern pattern = this.b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.c = true;
        }
    }

    @Override
    public final void d() {
        this.a.g = ((StringBuilder) this.d.c).toString();
        this.d = null;
    }

    @Override
    public final gk0 e() {
        return this.a;
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        if (!this.c) {
            if (vo3Var.h && this.b == null) {
                return null;
            }
            return vj2.a(vo3Var.b);
        }
        return null;
    }
}
