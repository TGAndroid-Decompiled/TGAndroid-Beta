package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f16944a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f16944a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f16944a.close();
    }
}
