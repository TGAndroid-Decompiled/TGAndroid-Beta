package org.aspectj.runtime.reflect;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import org.telegram.ui.iv.RichEditor;

public final class MethodSignatureImpl {
    public static boolean useCache = true;
    public final int $r8$classId;
    public Object declaringType;
    public Serializable declaringTypeName;
    public int modifiers;
    public Object name;
    public Object parameterTypes;
    public Serializable returnType;
    public Object stringCache;

    public MethodSignatureImpl(int i) {
        this.$r8$classId = i;
    }

    public AutoValue_PersistedInstallationEntry build() {
        String strM$1 = this.modifiers == 0 ? " registrationStatus" : "";
        if (((Long) this.returnType) == null) {
            strM$1 = strM$1.concat(" expiresInSecs");
        }
        if (((Long) this.stringCache) == null) {
            strM$1 = Fragment$$ExternalSyntheticOutline0.m$1(strM$1, " tokenCreationEpochInSecs");
        }
        if (strM$1.isEmpty()) {
            return new AutoValue_PersistedInstallationEntry((String) this.name, this.modifiers, (String) this.declaringTypeName, (String) this.declaringType, ((Long) this.returnType).longValue(), ((Long) this.stringCache).longValue(), (String) this.parameterTypes);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM$1));
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringMaker stringMaker = StringMaker.middleStringMaker;
                return toString$1();
            default:
                return super.toString();
        }
    }

    public String toString$1() {
        String string;
        StringMaker stringMaker = StringMaker.middleStringMaker;
        if (useCache) {
            RichEditor.AnonymousClass3 anonymousClass3 = (RichEditor.AnonymousClass3) this.stringCache;
            if (anonymousClass3 == null) {
                try {
                    RichEditor.AnonymousClass3 anonymousClass4 = new RichEditor.AnonymousClass3();
                    anonymousClass4.this$0 = new SoftReference(new String[3]);
                    this.stringCache = anonymousClass4;
                } catch (Throwable unused) {
                    useCache = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) anonymousClass3.this$0).get();
                if (strArr != null) {
                    string = strArr[0];
                }
            }
            string = null;
        } else {
            string = null;
        }
        if (string == null) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = this.modifiers;
            if (i == -1) {
                throw null;
            }
            String strConcat = "";
            if (stringMaker.includeModifiers) {
                String string2 = Modifier.toString(i);
                if (string2.length() != 0) {
                    strConcat = string2.concat(" ");
                }
            }
            stringBuffer.append(strConcat);
            if (stringMaker.includeArgs) {
                Class cls = (Class) this.returnType;
                cls.getClass();
                stringBuffer.append(StringMaker.makeTypeName(cls.getName(), cls, stringMaker.shortTypeNames));
            }
            if (stringMaker.includeArgs) {
                stringBuffer.append(" ");
            }
            Class cls2 = (Class) this.declaringType;
            cls2.getClass();
            if (((String) this.declaringTypeName) == null) {
                Class cls3 = (Class) this.declaringType;
                cls3.getClass();
                this.declaringTypeName = cls3.getName();
            }
            stringBuffer.append(StringMaker.makeTypeName((String) this.declaringTypeName, cls2, stringMaker.shortPrimaryTypeNames));
            stringBuffer.append(".");
            String str = (String) this.name;
            str.getClass();
            stringBuffer.append(str);
            Class[] clsArr = (Class[]) this.parameterTypes;
            if (stringMaker.includeArgs) {
                stringBuffer.append("(");
                for (int i2 = 0; i2 < clsArr.length; i2++) {
                    if (i2 > 0) {
                        stringBuffer.append(", ");
                    }
                    Class cls4 = clsArr[i2];
                    stringBuffer.append(StringMaker.makeTypeName(cls4.getName(), cls4, stringMaker.shortTypeNames));
                }
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
            string = stringBuffer.toString();
        }
        if (useCache) {
            RichEditor.AnonymousClass3 anonymousClass5 = (RichEditor.AnonymousClass3) this.stringCache;
            String[] strArr2 = (String[]) ((SoftReference) anonymousClass5.this$0).get();
            if (strArr2 == null) {
                strArr2 = new String[3];
                anonymousClass5.this$0 = new SoftReference(strArr2);
            }
            strArr2[0] = string;
        }
        return string;
    }

    public MethodSignatureImpl() {
        this.$r8$classId = 2;
        this.name = new RectF();
        this.declaringTypeName = new Bitmap[16];
        this.declaringType = new Rect();
        this.parameterTypes = new Paint();
    }
}
