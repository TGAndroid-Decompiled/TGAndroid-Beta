package di;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class c implements AutoCloseable {
    public final PrismaHighlighter f5957a;

    public c(PrismaHighlighter prismaHighlighter) {
        this.f5957a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f5957a.close();
    }
}
