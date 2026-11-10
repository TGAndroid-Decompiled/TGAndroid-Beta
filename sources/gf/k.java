package gf;

import f5.u;
import java.util.regex.Pattern;
public final class k extends mf.a {
    public static final Pattern[][] f13913e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f13915b;
    public final kf.j f13914a = new kf.p();
    public boolean f13916c = false;
    public u d = new u(6, (short) 0);

    public k(Pattern pattern) {
        this.f13915b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        u uVar = this.d;
        StringBuilder sb2 = (StringBuilder) uVar.f11196c;
        if (uVar.f11195b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        uVar.f11195b++;
        Pattern pattern = this.f13915b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f13916c = true;
        }
    }

    @Override
    public final void d() {
        this.f13914a.f17274g = ((StringBuilder) this.d.f11196c).toString();
        this.d = null;
    }

    @Override
    public final kf.a e() {
        return this.f13914a;
    }

    @Override
    public final a h(h hVar) {
        if (!this.f13916c) {
            if (hVar.h && this.f13915b == null) {
                return null;
            }
            return a.a(hVar.f13895b);
        }
        return null;
    }
}
