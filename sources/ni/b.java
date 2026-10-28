package ni;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f18870a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f18870a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f18870a.close();
    }
}
