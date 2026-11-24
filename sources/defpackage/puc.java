package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
public interface puc {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    StaticsBoundaryInterface getStatics();

    String[] z0();
}
