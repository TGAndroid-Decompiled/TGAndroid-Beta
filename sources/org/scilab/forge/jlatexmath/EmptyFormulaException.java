package org.scilab.forge.jlatexmath;
public class EmptyFormulaException extends Exception {
    private static final long serialVersionUID = -8034123603703695067L;

    public EmptyFormulaException() {
        super("Illegal operation with an empty Formula!");
    }
}
