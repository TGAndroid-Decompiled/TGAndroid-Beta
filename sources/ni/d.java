package ni;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class d implements AutoCloseable {
    public final PrismaHighlighter f20624a;

    public d(PrismaHighlighter prismaHighlighter) {
        this.f20624a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f20624a.close();
    }
}
