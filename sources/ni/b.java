package ni;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f18871a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f18871a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f18871a.close();
    }
}
