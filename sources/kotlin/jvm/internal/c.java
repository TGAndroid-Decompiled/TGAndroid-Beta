package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
public abstract class c implements fd.b, Serializable {
    public static final Object NO_RECEIVER = b.f13917a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient fd.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public fd.b compute() {
        fd.b bVar = this.reflected;
        if (bVar == null) {
            fd.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    public abstract fd.b computeReflected();

    @Override
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public fd.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            r.f13928a.getClass();
            return new l(cls);
        }
        return r.a(cls);
    }

    @Override
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract fd.b getReflected();

    @Override
    public fd.h getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override
    public fd.i getVisibility() {
        return getReflected().getVisibility();
    }

    @Override
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
