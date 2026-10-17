package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f16939a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f16939a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f16939a.close();
    }
}
