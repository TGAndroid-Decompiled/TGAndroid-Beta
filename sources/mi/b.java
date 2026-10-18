package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f16946a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f16946a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f16946a.close();
    }
}
