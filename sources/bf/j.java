package bf;

import d5.z;
import java.util.regex.Pattern;
public final class j extends gf.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f3940b;
    public final ef.j f3939a = new ef.p();
    public boolean f3941c = false;
    public z d = new z(1, (short) 0);

    public j(Pattern pattern) {
        this.f3940b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        z zVar = this.d;
        StringBuilder sb2 = (StringBuilder) zVar.f8027c;
        if (zVar.f8026b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        zVar.f8026b++;
        Pattern pattern = this.f3940b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f3941c = true;
        }
    }

    @Override
    public final void d() {
        this.f3939a.f9929g = ((StringBuilder) this.d.f8027c).toString();
        this.d = null;
    }

    @Override
    public final ef.a e() {
        return this.f3939a;
    }

    @Override
    public final a h(g gVar) {
        if (!this.f3941c) {
            if (gVar.h && this.f3940b == null) {
                return null;
            }
            return a.a(gVar.f3922b);
        }
        return null;
    }
}
