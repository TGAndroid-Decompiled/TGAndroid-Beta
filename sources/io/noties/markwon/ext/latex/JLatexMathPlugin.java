package io.noties.markwon.ext.latex;

import android.os.Handler;
import android.os.Looper;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.ImageSizeResolver;
import io.noties.markwon.inlineparser.MarkwonInlineParserPlugin;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.commonmark.parser.Parser;

public class JLatexMathPlugin extends AbstractMarkwonPlugin {
    final Config config;
    private final ImageSizeResolver inlineImageSizeResolver = new InlineImageSizeResolver(null);
    private final JLatexBlockImageSizeResolver jLatexBlockImageSizeResolver;
    private final JLatextAsyncDrawableLoader jLatextAsyncDrawableLoader;

    abstract class AnonymousClass1 {
    }

    public interface BuilderConfigure {
        void configureBuilder(Builder builder);
    }

    public interface ErrorHandler {
    }

    public static JLatexMathPlugin create(float f, BuilderConfigure builderConfigure) {
        Builder builder = builder(f);
        builderConfigure.configureBuilder(builder);
        return new JLatexMathPlugin(builder.build());
    }

    public static Builder builder(float f) {
        return new Builder(JLatexMathTheme.builder(f));
    }

    static class Config {
        final boolean blocksEnabled;
        final boolean blocksLegacy;
        final ExecutorService executorService;
        final boolean inlinesEnabled;
        final JLatexMathTheme theme;

        Config(Builder builder) {
            this.theme = builder.theme.build();
            this.blocksEnabled = builder.blocksEnabled;
            this.blocksLegacy = builder.blocksLegacy;
            this.inlinesEnabled = builder.inlinesEnabled;
            Builder.access$400(builder);
            ExecutorService executorService = builder.executorService;
            this.executorService = executorService == null ? Executors.newCachedThreadPool() : executorService;
        }
    }

    JLatexMathPlugin(Config config) {
        this.config = config;
        this.jLatextAsyncDrawableLoader = new JLatextAsyncDrawableLoader(config);
        this.jLatexBlockImageSizeResolver = new JLatexBlockImageSizeResolver(config.theme.blockFitCanvas());
    }

    public void configure(MarkwonPlugin.Registry registry) {
        if (this.config.inlinesEnabled) {
            ((MarkwonInlineParserPlugin) registry.require(MarkwonInlineParserPlugin.class)).factoryBuilder().addInlineProcessor(new JLatexMathInlineProcessor());
        }
    }

    public void configureParser(Parser.Builder builder) {
        Config config = this.config;
        if (config.blocksEnabled) {
            if (config.blocksLegacy) {
                builder.customBlockParserFactory(new JLatexMathBlockParserLegacy.Factory());
            } else {
                builder.customBlockParserFactory(new JLatexMathBlockParser.Factory());
            }
        }
    }

    public static class Builder {
        private boolean blocksEnabled = true;
        private boolean blocksLegacy;
        private ExecutorService executorService;
        private boolean inlinesEnabled;
        private final JLatexMathTheme.Builder theme;

        static ErrorHandler access$400(Builder builder) {
            builder.getClass();
            return null;
        }

        Builder(JLatexMathTheme.Builder builder) {
            this.theme = builder;
        }

        public Builder inlinesEnabled(boolean z) {
            this.inlinesEnabled = z;
            return this;
        }

        public Config build() {
            return new Config(this);
        }
    }

    static class JLatextAsyncDrawableLoader extends AsyncDrawableLoader {
        private final Config config;
        private final Handler handler = new Handler(Looper.getMainLooper());
        private final Map cache = new HashMap(3);

        JLatextAsyncDrawableLoader(Config config) {
            this.config = config;
        }
    }

    private static class InlineImageSizeResolver extends ImageSizeResolver {
        private InlineImageSizeResolver() {
        }

        InlineImageSizeResolver(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
