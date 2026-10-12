package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import j$.util.function.Consumer$CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline = 0;
        public final ArrayList f16961a = new ArrayList();
        public final ArrayList f16962b = new ArrayList();
        public final ArrayList f16963c = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.f16961a.add(obj);
            this.f16962b.add(str);
            this.f16963c.add(list);
        }

        public Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f16961a, this.f16962b, this.f16963c});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
