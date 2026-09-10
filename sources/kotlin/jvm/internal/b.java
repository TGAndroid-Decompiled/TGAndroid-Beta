package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
public abstract class b implements vd.b, Serializable {
    public static final Object NO_RECEIVER = a.f12566a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vd.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z10) {
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

    public vd.b compute() {
        vd.b bVar = this.reflected;
        if (bVar == null) {
            vd.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    public abstract vd.b computeReflected();

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

    public vd.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            q.f12577a.getClass();
            return new k(cls);
        }
        return q.a(cls);
    }

    @Override
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract vd.b getReflected();

    @Override
    public vd.h getReturnType() {
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
    public vd.i getVisibility() {
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
