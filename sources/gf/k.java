package gf;

import f5.u;
import java.util.regex.Pattern;
public final class k extends mf.a {
    public static final Pattern[][] f13911e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f13913b;
    public final kf.j f13912a = new kf.p();
    public boolean f13914c = false;
    public u d = new u(6, (short) 0);

    public k(Pattern pattern) {
        this.f13913b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        u uVar = this.d;
        StringBuilder sb2 = (StringBuilder) uVar.f11191c;
        if (uVar.f11190b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        uVar.f11190b++;
        Pattern pattern = this.f13913b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f13914c = true;
        }
    }

    @Override
    public final void d() {
        this.f13912a.f17271g = ((StringBuilder) this.d.f11191c).toString();
        this.d = null;
    }

    @Override
    public final kf.a e() {
        return this.f13912a;
    }

    @Override
    public final a h(h hVar) {
        if (!this.f13914c) {
            if (hVar.h && this.f13913b == null) {
                return null;
            }
            return a.a(hVar.f13893b);
        }
        return null;
    }
}
