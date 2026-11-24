package defpackage;

import java.util.regex.Pattern;
public final class ci5 extends x1 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final bi5 a = new ui6();
    public boolean c = false;
    public de d = new de((byte) 1);

    public ci5(Pattern pattern) {
        this.b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        de deVar = this.d;
        StringBuilder sb = (StringBuilder) deVar.c;
        if (deVar.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        deVar.b++;
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
    public final gl0 e() {
        return this.a;
    }

    @Override
    public final il2 h(fq3 fq3Var) {
        if (!this.c) {
            if (fq3Var.h && this.b == null) {
                return null;
            }
            return il2.a(fq3Var.b);
        }
        return null;
    }
}
