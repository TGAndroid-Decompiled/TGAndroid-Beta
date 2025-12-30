package kotlin.reflect;

import java.util.List;
import java.util.Map;

public interface KCallable extends KAnnotatedElement {
    Object call(Object... objArr);

    Object callBy(Map map);

    List getParameters();

    KType getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();
}
