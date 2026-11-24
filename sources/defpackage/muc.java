package defpackage;
public abstract class muc {
    public static final bo a;
    public static final bo b;
    public static final bo c;
    public static final bo d;
    public static final bo e;

    static {
        new bo("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte) 0);
        new bo("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte) 0);
        new bo("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte) 3);
        new bo("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte) 1);
        new bo("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte) 4);
        new bo("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new bo("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new bo("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new bo("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new bo("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte) 4);
        new bo("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte) 1);
        new bo("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte) 1);
        new bo("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte) 1);
        new bo("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte) 1);
        new bo("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte) 1);
        new bo("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte) 1);
        new bo("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte) 0);
        new bo("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte) 0);
        new bo("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte) 1);
        new bo("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte) 4);
        new bo("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte) 1);
        new bo("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte) 0);
        new bo("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte) 0);
        new bo("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte) 4);
        new bo("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte) 4);
        new bo("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte) 4);
        new bo("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte) 0);
        new bo("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte) 0);
        a = new bo("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", (byte) 2);
        new bo("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte) 0);
        new bo("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte) 0);
        new bo("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte) 0);
        new bo("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte) 0);
        new bo("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte) 3);
        new bo("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte) 3);
        new bo("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte) 6);
        new bo("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte) 6);
        new bo("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte) 5);
        new dwa();
        new dwa();
        new dwa();
        new bo("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte) 6);
        new kuc();
        new bo("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte) 2);
        b = new bo("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte) 2);
        new bo("FORCE_DARK", "FORCE_DARK", (byte) 6);
        new bo("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte) 2);
        c = new bo("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte) 2);
        d = new bo("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new bo("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte) 2);
        new bo("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte) 2);
        new bo("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte) 2);
        new bo("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte) 2);
        new bo("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte) 2);
        new bo("USER_AGENT_METADATA", "USER_AGENT_METADATA", (byte) 2);
        new luc("MULTI_PROFILE", "MULTI_PROFILE", (byte) 0);
        new bo("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", (byte) 2);
        new bo("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", (byte) 2);
        new bo("MUTE_AUDIO", "MUTE_AUDIO", (byte) 2);
        new bo("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", (byte) 2);
        new bo("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", (byte) 2);
        new bo("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", (byte) 2);
        new bo("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", (byte) 2);
        new luc("PREFETCH_URL_V4", "PREFETCH_URL_V4", (byte) 1);
        new bo("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP", (byte) 2);
        new bo("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", (byte) 2);
        new bo("PRERENDER_URL_V2", "PRERENDER_URL_V2", (byte) 2);
        new bo("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", (byte) 2);
        new bo("SAVE_STATE", "SAVE_STATE", (byte) 2);
        new bo("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", (byte) 2);
        e = new bo("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW", (byte) 2);
        new bo("PAYMENT_REQUEST", "PAYMENT_REQUEST", (byte) 2);
        new bo("WEBVIEW_BUILDER", "WEBVIEW_BUILDER", (byte) 2);
    }

    public static boolean a(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muc.a(java.lang.String):boolean");
    }
}
