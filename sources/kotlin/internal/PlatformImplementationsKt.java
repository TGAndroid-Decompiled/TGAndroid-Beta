package kotlin.internal;

import kotlin.internal.jdk8.JDK8PlatformImplementations;

public abstract class PlatformImplementationsKt {
    public static final PlatformImplementations IMPLEMENTATIONS = new JDK8PlatformImplementations();
}
