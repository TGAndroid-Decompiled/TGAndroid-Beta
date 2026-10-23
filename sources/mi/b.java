package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f17008a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f17008a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f17008a.close();
    }
}
