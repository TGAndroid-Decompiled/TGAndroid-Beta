package gf;

import f5.v;
import java.util.regex.Pattern;
public final class j extends mf.a {
    public static final Pattern[][] f13253e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f13255b;
    public final kf.j f13254a = new kf.p();
    public boolean f13256c = false;
    public v d = new v(6, (short) 0);

    public j(Pattern pattern) {
        this.f13255b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        v vVar = this.d;
        StringBuilder sb2 = (StringBuilder) vVar.f11019c;
        if (vVar.f11018b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        vVar.f11018b++;
        Pattern pattern = this.f13255b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f13256c = true;
        }
    }

    @Override
    public final void d() {
        this.f13254a.f17833g = ((StringBuilder) this.d.f11019c).toString();
        this.d = null;
    }

    @Override
    public final kf.a e() {
        return this.f13254a;
    }

    @Override
    public final a h(g gVar) {
        if (!this.f13256c) {
            if (gVar.h && this.f13255b == null) {
                return null;
            }
            return a.a(gVar.f13235b);
        }
        return null;
    }
}
