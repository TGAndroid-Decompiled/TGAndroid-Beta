package defpackage;

import java.util.regex.Pattern;
public final class fi5 extends y1 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final ei5 a = new yi6();
    public boolean c = false;
    public ed d = new ed((byte) 1);

    public fi5(Pattern pattern) {
        this.b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        ed edVar = this.d;
        StringBuilder sb = (StringBuilder) edVar.c;
        if (edVar.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        edVar.b++;
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
    public final hk0 e() {
        return this.a;
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        if (!this.c) {
            if (mp3Var.h && this.b == null) {
                return null;
            }
            return qk2.a(mp3Var.b);
        }
        return null;
    }
}
