package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f16945a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f16945a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f16945a.close();
    }
}
