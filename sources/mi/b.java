package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f16947a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f16947a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f16947a.close();
    }
}
