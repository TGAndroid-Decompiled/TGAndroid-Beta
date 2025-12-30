package org.aspectj.runtime.reflect;

import org.aspectj.lang.Signature;

abstract class MemberSignatureImpl extends SignatureImpl implements Signature {
    MemberSignatureImpl(int i, String str, Class cls) {
        super(i, str, cls);
    }
}
