package c5;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
public interface p {
    String[] b();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    StaticsBoundaryInterface getStatics();
}
