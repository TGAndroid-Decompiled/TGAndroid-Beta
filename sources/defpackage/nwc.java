package defpackage;
public abstract class nwc {
    public static final cp a;
    public static final cp b;
    public static final cp c;
    public static final cp d;
    public static final cp e;

    static {
        new cp("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte) 0);
        new cp("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte) 0);
        new cp("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte) 3);
        new cp("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte) 1);
        new cp("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte) 4);
        new cp("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new cp("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new cp("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte) 4);
        new cp("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte) 4);
        new cp("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte) 4);
        new cp("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte) 1);
        new cp("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte) 1);
        new cp("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte) 1);
        new cp("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte) 1);
        new cp("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte) 1);
        new cp("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte) 1);
        new cp("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte) 0);
        new cp("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte) 0);
        new cp("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte) 1);
        new cp("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte) 4);
        new cp("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte) 1);
        new cp("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte) 0);
        new cp("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte) 0);
        new cp("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte) 4);
        new cp("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte) 4);
        new cp("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte) 4);
        new cp("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte) 0);
        new cp("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte) 0);
        a = new cp("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", (byte) 2);
        new cp("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte) 0);
        new cp("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte) 0);
        new cp("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte) 0);
        new cp("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte) 0);
        new cp("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte) 3);
        new cp("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte) 3);
        new cp("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte) 6);
        new cp("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte) 6);
        new cp("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte) 5);
        new gya();
        new gya();
        new gya();
        new cp("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte) 6);
        new lwc();
        new cp("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte) 2);
        b = new cp("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte) 2);
        new cp("FORCE_DARK", "FORCE_DARK", (byte) 6);
        new cp("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte) 2);
        c = new cp("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte) 2);
        d = new cp("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new cp("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte) 2);
        new cp("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte) 2);
        new cp("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte) 2);
        new cp("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte) 2);
        new cp("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte) 2);
        new cp("USER_AGENT_METADATA", "USER_AGENT_METADATA", (byte) 2);
        new mwc("MULTI_PROFILE", "MULTI_PROFILE", (byte) 0);
        new cp("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", (byte) 2);
        new cp("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", (byte) 2);
        new cp("MUTE_AUDIO", "MUTE_AUDIO", (byte) 2);
        new cp("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", (byte) 2);
        new cp("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", (byte) 2);
        new cp("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", (byte) 2);
        new cp("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", (byte) 2);
        new mwc("PREFETCH_URL_V4", "PREFETCH_URL_V4", (byte) 1);
        new cp("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP", (byte) 2);
        new cp("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", (byte) 2);
        new cp("PRERENDER_URL_V2", "PRERENDER_URL_V2", (byte) 2);
        new cp("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", (byte) 2);
        new cp("SAVE_STATE", "SAVE_STATE", (byte) 2);
        new cp("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", (byte) 2);
        e = new cp("CACHE_PROVIDER", "PROVIDER_WEAKLY_REF_WEBVIEW", (byte) 2);
        new cp("PAYMENT_REQUEST", "PAYMENT_REQUEST", (byte) 2);
        new cp("WEBVIEW_BUILDER", "WEBVIEW_BUILDER", (byte) 2);
    }

    public static boolean a(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwc.a(java.lang.String):boolean");
    }
}
